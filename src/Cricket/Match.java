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
        fastMediumBowlers[1] = new FastMediumBowler("Sauyma Sarkar");

        FastBowler [] fastBowlers = new FastBowler[3];

        fastBowlers[0] = new FastBowler("Mustafizur Rahman");
        fastBowlers[1] = new FastBowler("Rubel Hossain");
        fastBowlers[2] = new FastBowler("Taskin Ahmed");

        int iterator=0;
        int jterator=0;

        for(iterator=0;iterator<50;iterator++){

            int bowlerType = (int) (Math.random()*3)+1;
            int currentBowler=0;
            if(bowlerType==1){
                currentBowler = (int) (Math.random()*4);
                for(jterator=1;jterator<=6;jterator++){

                    int ballNo = (iterator*6)+jterator;
                    int currentSpeed=spinBowlers[currentBowler].setBowlingSpeed(spinBowlers[currentBowler].upperSpeed,
                            spinBowlers[currentBowler].lowerSpeed);
                    System.out.println(ballNo+" th ball, " +
                            spinBowlers[currentBowler].name+" at ," +currentSpeed
                            +" Km/h");
                   Double floatSpeed = new Double(currentSpeed);
                    spinBowlers[currentBowler].totalSpeed+=floatSpeed;

                }
                spinBowlers[currentBowler].totalOver++;

            }
            else  if(bowlerType==2){
                currentBowler = (int) (Math.random()*2);
                for(jterator=1;jterator<=6;jterator++){
                    int ballNo = (iterator*6)+jterator;
                    int currentSpeed=fastMediumBowlers[currentBowler].setBowlingSpeed(fastMediumBowlers[currentBowler].upperSpeed,
                            fastMediumBowlers[currentBowler].lowerSpeed);
                    System.out.println(ballNo+" th ball, " +
                            fastMediumBowlers[currentBowler].name+" at ," +
                            currentSpeed+" Km/h");
                    Double floatSpeed = new Double(currentSpeed);
                    spinBowlers[currentBowler].totalSpeed+=floatSpeed;
                }
                fastMediumBowlers[currentBowler].totalOver++;

            }
            else  if(bowlerType==3){
                currentBowler = (int) (Math.random()*3);
                for(jterator=1;jterator<=6;jterator++){
                    int ballNo = (iterator*6)+jterator;
                    int currentSpeed=fastBowlers[currentBowler].setBowlingSpeed(fastBowlers[currentBowler].upperSpeed,
                            fastBowlers[currentBowler].lowerSpeed);
                    System.out.println(ballNo+" th ball, " +
                            fastBowlers[currentBowler].name+" at ," +currentSpeed
                            +" Km/h");
                    Double floatSpeed = new Double(currentSpeed);
                    spinBowlers[currentBowler].totalSpeed+=floatSpeed;
                }
                fastBowlers[currentBowler].totalOver++;

            }


        }

    }
}
