package SynchronizationProcess;

import java.util.Random;

public class PetersonSolution {

    static int BUFFER_SIZE = 10;
    static int in=0,out=0;
    static int [] buffer = new int[10];
    static int  count=0;
    static int nextProduced=0;
    static int nextConsumed=0;
    static int iProcess=0,jProcess=0;
    static boolean [] checkSync = new boolean[2];
    static int processTurn=0;
    static  boolean iO = true;

    public static void petersonSolution(){
        while(iO==true){

            checkSync[iProcess]=true;
                       processTurn = jProcess;
                       while (checkSync[jProcess]&&processTurn==jProcess){

                           consumer();
                           checkSync[iProcess]=false;
                           iO=false;
                       }

                       while (iO=true){
                           checkSync[jProcess]=true;
                           processTurn=iProcess;
                           while (checkSync[iProcess]&&processTurn==iProcess){
                               producer();;
                               checkSync[jProcess]=false;
                               iO=false;
                           }
                       }

        }


    }
    public static void printItem(){
        int iterator;
        for(iterator=0;iterator<BUFFER_SIZE;iterator++){
            System.out.print(buffer[iterator]+"\t");
        }
    }

    public static void producer(){
        Random producerRandom = new Random();
        while(count==BUFFER_SIZE);

        nextProduced = producerRandom.nextInt(70);
        buffer[in] = nextProduced;
        in = (in+1)%BUFFER_SIZE;
        count++;
        System.out.println("\nProducer:\t");
        printItem();
    }
    public static void consumer(){
        while(count==0);

        nextConsumed =buffer[out];
        out = (out+1)%BUFFER_SIZE;
        count--;
        System.out.println("\nConsumer:\t");
        printItem();

    }


    public static void main(String[] args) {
        Random random = new Random();


        int iterator;
        int roundNumber = 1100;
        for(iterator=0;iterator<roundNumber;iterator++){
            if(random.nextInt(2)==0){
                producer();
            }
            else{
                consumer();
            }

        }

    }





}
