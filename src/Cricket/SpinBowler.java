package Cricket;

public class SpinBowler extends Bowler {
    String name;

    public SpinBowler(String name) {
        this.name = name;
    }

    int bowlingSpeed=0;
    int lowerSpeed=136;
    int upperSpeed=150;
    public int setBowlingSpeed() {
        return super.setBowlingSpeed(upperSpeed, lowerSpeed);
    }
}
