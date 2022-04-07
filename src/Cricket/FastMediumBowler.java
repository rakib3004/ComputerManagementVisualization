package Cricket;

public class FastMediumBowler extends Bowler {
    String name;

    public FastMediumBowler(String name) {
        this.name = name;
    }

    int lowerSpeed = 120;
    int upperSpeed = 135;

    public int setBowlingSpeed() {
        return super.setBowlingSpeed(upperSpeed, lowerSpeed);
    }

}
