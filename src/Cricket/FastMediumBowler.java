package Cricket;

public class FastMediumBowler extends Bowler {
    String name;

    public FastMediumBowler(String name) {
        this.name = name;
    }
    int lowerSpeed=136;
    int upperSpeed=150;
    public int setBowlingSpeed() {
        return super.setBowlingSpeed(upperSpeed, lowerSpeed);
    }

}
