package InterruptDrivenInputOutputCycle;

public class CPU {

    public static void main(String[] args) {
        InputOutputController inputOutputController = new InputOutputController();

        System.out.println("Device Driver Ready to initiate I/O");
        System.out.println("------------------------------------");
        inputOutputController.initiatesInputOutput();
        System.out.println("CPU interrupts between instruction for checking");

    }

    void transferControlToInterruptHandler(){

    }

    void processData(){

    }

   void resumesInterruptProcessingTask(){

    }
}
