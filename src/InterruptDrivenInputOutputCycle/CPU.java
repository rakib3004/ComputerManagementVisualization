package InterruptDrivenInputOutputCycle;

public class CPU {

    public static void main(String[] args) {
        InputOutputController inputOutputController = new InputOutputController();

        System.out.println("1.Device Driver Ready to initiate I/O");
    //    inputOutputController.initiatesInputOutput();
        System.out.println();
        System.out.println("CPU interrupts between instruction for checking");
        System.out.println();

        transferControlToInterruptHandler();
    }

    static void transferControlToInterruptHandler(){

        System.out.println("4.CPU Receiving interrupt");
        System.out.println("Transfer control to Interrupt Handler");
        interruptHandler();

    }

    static void interruptHandler(){
        System.out.println("5.Processing Data!!!!!!");

    }

 static void resumesInterruptProcessingTask(){
     System.out.println("6.CPU resumes!!!!");
     System.out.println("Processing of Interrupted Data");
     System.out.println("***********Finish***************");


 }
}
