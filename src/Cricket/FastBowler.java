package Cricket;

public class FastBowler extends Bowler {
    int bowlingSpeed=0;
    int lowerSpeed=136;
    int upperSpeed=150;
    public int setBowlingSpeed() {
        return super.setBowlingSpeed(upperSpeed, lowerSpeed);
    }
}
