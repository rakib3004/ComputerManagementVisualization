package InterruptDrivenInputOutputCycle;

public class InputOutputController {

    void initiatesInputOutput() {

        System.out.println("2.I/O Controller initiates I/O");
        generateInterruptSignal();

    }

    void generateInterruptSignal() {
        System.out.println("3.Input is ready");
        System.out.println("Output is complete");
        System.out.println("Interrupt Signals for Error");

    }

}
