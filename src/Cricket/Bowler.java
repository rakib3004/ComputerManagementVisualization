package Cricket;

public class Bowler {
    int totalOver=0;
    int lowerSpeed=70;
    int upperSpeed=150;
  public  int setBowlingSpeed(int upperSpeed, int lowerSpeed){
      int currentSpeed = (int) ((Math.random()*(upperSpeed - lowerSpeed)) + lowerSpeed);
        return currentSpeed;
    }
}
