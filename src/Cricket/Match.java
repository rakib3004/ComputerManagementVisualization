package Cricket;

public class Match {

    public static void main(String[] args) {
        SpinBowler [] spinBowlers = new SpinBowler[4];
        spinBowlers[0] = new SpinBowler("Shakib Al Hasan");
        spinBowlers[1] = new SpinBowler("Mahmudullah Riyad");
        spinBowlers[2] = new SpinBowler("Mehedi Miraz");
        spinBowlers[3] = new SpinBowler("Taijul Islam");

        FastMediumBowler [] fastMediumBowlers = new FastMediumBowler[2];

        fastMediumBowlers[0] = new FastMediumBowler("Mohammad Saifuddin");
        fastMediumBowlers[0] = new FastMediumBowler("Sauyma Sarkar");

        FastBowler [] fastBowlers = new FastBowler[3];

        fastBowlers[0] = new FastBowler("Mustafizur Rahman");
        fastBowlers[1] = new FastBowler("Rubel Hossain");
        fastBowlers[2] = new FastBowler("Taskin Ahmed");

    }
}
