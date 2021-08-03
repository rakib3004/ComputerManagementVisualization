package Cricket;

public class FastBowler extends Bowler {
    String name;

    public FastBowler(String name) {
        this.name = name;
    }
    int lowerSpeed=130;
    int upperSpeed=150;
    public int setBowlingSpeed() {
        return super.setBowlingSpeed(upperSpeed, lowerSpeed);
    }
}
