package InterruptDrivenInputOutputCycle;

public class CPU {

    public static void main(String[] args) {
        InputOutputController inputOutputController = new InputOutputController();

        System.out.println("Device Driver Start to initiate I/O");
        System.out.println("------------------------------------");
        inputOutputController.initiatesInputOutput();
    }

    void transferControlToInterruptHandler(){

    }

    void processData(){

    }

   void resumesInterruptProcessingTask(){

    }
}
