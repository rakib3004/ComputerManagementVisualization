// 
// Decompiled by Procyon v0.5.36
// 

package SynchronizationProcess;

import java.util.Random;

public class PetersonSolution
{
    static int BUFFER_SIZE;
    static int in;
    static int out;
    static int[] buffer;
    static int count;
    static int nextProduced;
    static int nextConsumed;
    static int iProcess;
    static int jProcess;
    static boolean[] checkSync;
    static int processTurn;
    static boolean iO;
    static boolean jO;
    
    public static void petersonSolution() {
        final Random random = new Random();
        if (random.nextInt(2) == 0) {
            PetersonSolution.iO = true;
            PetersonSolution.jO = false;
        }
        else {
            PetersonSolution.iO = false;
            PetersonSolution.jO = true;
        }
        while (PetersonSolution.iO) {
            PetersonSolution.checkSync[PetersonSolution.iProcess] = true;
            PetersonSolution.processTurn = PetersonSolution.jProcess;
            while (PetersonSolution.checkSync[PetersonSolution.jProcess] && PetersonSolution.processTurn == PetersonSolution.jProcess) {}
            consumer();
            PetersonSolution.checkSync[PetersonSolution.iProcess] = false;
            PetersonSolution.iO = false;
        }
        while (PetersonSolution.jO) {
            PetersonSolution.checkSync[PetersonSolution.jProcess] = true;
            PetersonSolution.processTurn = PetersonSolution.iProcess;
            while (PetersonSolution.checkSync[PetersonSolution.iProcess] && PetersonSolution.processTurn == PetersonSolution.iProcess) {}
            producer();
            PetersonSolution.checkSync[PetersonSolution.jProcess] = false;
            PetersonSolution.jO = false;
        }
    }
    
    public static void printItem() {
        for (int iterator = 0; iterator < PetersonSolution.BUFFER_SIZE; ++iterator) {
            System.out.print(PetersonSolution.buffer[iterator] + "\t");
        }
    }
    
    public static void producer() {
        final Random producerRandom = new Random();
        while (PetersonSolution.count == PetersonSolution.BUFFER_SIZE) {}
        PetersonSolution.nextProduced = producerRandom.nextInt(70);
        PetersonSolution.buffer[PetersonSolution.in] = PetersonSolution.nextProduced;
        PetersonSolution.in = (PetersonSolution.in + 1) % PetersonSolution.BUFFER_SIZE;
        ++PetersonSolution.count;
        System.out.println("\nProducer:\t");
        printItem();
    }
    
    public static void consumer() {
        while (PetersonSolution.count == 0) {}
        PetersonSolution.nextConsumed = PetersonSolution.buffer[PetersonSolution.out];
        PetersonSolution.out = (PetersonSolution.out + 1) % PetersonSolution.BUFFER_SIZE;
        --PetersonSolution.count;
        System.out.println("\nConsumer:\t");
        printItem();
    }
    
    public static void main(final String[] args) {
        for (int roundNumber = 15, iterator = 0; iterator < roundNumber; ++iterator) {
            petersonSolution();
        }
    }
    
    static {
        PetersonSolution.BUFFER_SIZE = 15;
        PetersonSolution.in = 0;
        PetersonSolution.out = 0;
        PetersonSolution.buffer = new int[15];
        PetersonSolution.count = 0;
        PetersonSolution.nextProduced = 0;
        PetersonSolution.nextConsumed = 0;
        PetersonSolution.iProcess = 0;
        PetersonSolution.jProcess = 1;
        PetersonSolution.checkSync = new boolean[2];
        PetersonSolution.processTurn = 0;
        PetersonSolution.iO = true;
        PetersonSolution.jO = true;
    }
}