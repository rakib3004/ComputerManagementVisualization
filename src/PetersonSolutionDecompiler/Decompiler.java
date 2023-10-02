package SynchronizationProcess;

import java.util.Random;

public class PetersonSolution {
   static int BUFFER_SIZE = 15;
   static int in = 0;
   static int out = 0;
   static int[] buffer = new int[15];
   static int count = 0;
   static int nextProduced = 0;
   static int nextConsumed = 0;
   static int iProcess = 0;
   static int jProcess = 1;
   static boolean[] checkSync = new boolean[2];
   static int processTurn = 0;
   static boolean iO = true;
   static boolean jO = true;

   public static void petersonSolution() {
      Random random = new Random();
      if (random.nextInt(2) == 0) {
         iO = true;
         jO = false;
      } else {
         iO = false;
         jO = true;
      }

      while(iO) {
         checkSync[iProcess] = true;
         processTurn = jProcess;

         while(checkSync[jProcess] && processTurn == jProcess) {
         }

         consumer();
         checkSync[iProcess] = false;
         iO = false;
      }

      while(jO) {
         checkSync[jProcess] = true;
         processTurn = iProcess;

         while(checkSync[iProcess] && processTurn == iProcess) {
         }

         producer();
         checkSync[jProcess] = false;
         jO = false;
      }

   }

   public static void printItem() {
      for(int iterator = 0; iterator < BUFFER_SIZE; ++iterator) {
         System.out.print(buffer[iterator] + "\t");
      }

   }

   public static void producer() {
      Random producerRandom = new Random();

      while(count == BUFFER_SIZE) {
      }

      nextProduced = producerRandom.nextInt(70);
      buffer[in] = nextProduced;
      in = (in + 1) % BUFFER_SIZE;
      ++count;
      System.out.println("\nProducer:\t");
      printItem();
   }

   public static void consumer() {
      while(count == 0) {
      }

      nextConsumed = buffer[out];
      out = (out + 1) % BUFFER_SIZE;
      --count;
      System.out.println("\nConsumer:\t");
      printItem();
   }

   public static void main(String[] args) {
      int roundNumber = 15;

      for(int iterator = 0; iterator < roundNumber; ++iterator) {
         petersonSolution();
      }

   }
}