package Cricket;

public class SpinBowler extends Bowler {
    String name;

    public SpinBowler(String name){ this.name = name; }

    int lowerSpeed=70;
    int upperSpeed=115;
    public int setBowlingSpeed() {
        return super.setBowlingSpeed(upperSpeed, lowerSpeed);
    }
}
