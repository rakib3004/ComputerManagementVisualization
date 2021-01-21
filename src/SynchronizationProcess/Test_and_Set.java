package SynchronizationProcess;

import java.util.Random;

public class Test_and_Set {


    static int BUFFER_SIZE = 15;
    static int in=0,out=0;
    static int [] buffer = new int[15];
    static int  count=0;
    static int nextProduced=0;
    static int nextConsumed=0;
    static int iProcess=0,jProcess=1;
    static boolean [] checkSync = new boolean[2];
    static int processTurn=0;
    static  boolean iO = true;
    static  boolean jO = true;
static boolean lock =false;

    public static   boolean testAndSetCheck(boolean target){
    boolean rv = target;
    target=true;

        return rv;
    }

    synchronized  public static  void test_and_setImplementation(){

        Random random = new Random();

        if(random.nextInt(2)==0){
            iO=true;
            jO=false;
        }
        else{
            iO=false;
            jO=true;
        }


        while(iO==true){
         while (testAndSetCheck(lock));
         consumer();

         lock = false;

                iO=false;

        }

        while (jO=true){
            while (testAndSetCheck(lock));
            producer();

            lock = false;


            jO=false;

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
        while(count==BUFFER_SIZE) ;

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


        int iterator;
        int roundNumber = 15;
        for(iterator=0;iterator<roundNumber;iterator++){
        /*    if(random.nextInt(2)==0){
                producer();
            }
            else{
                consumer();
            }*/
            test_and_setImplementation();

        }

    }

}
