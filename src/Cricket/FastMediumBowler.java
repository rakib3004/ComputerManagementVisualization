package Cricket;

public class FastMediumBowler extends Bowler {
    int name;

    public FastMediumBowler(int name) {
        this.name = name;
    }
    int bowlingSpeed=0;
    int lowerSpeed=136;
    int upperSpeed=150;
    public int setBowlingSpeed() {
        return super.setBowlingSpeed(upperSpeed, lowerSpeed);
    }

}
