package InterruptDrivenInputOutputCycle;

public class InputOutputController {

    void initiatesInputOutput(){

        System.out.println("I/O Controller initiates I/O");
        System.out.println("------------------------------------");

        generateInterruptSignal();

    }
void generateInterruptSignal(){
    System.out.println("--->Input is ready!!!!!");
    System.out.println("--->Output is complete!!!!!");
    System.out.println("--->Interrupt Signals for Error!!!!!");
    System.out.println("------------------------------------");

}

}
