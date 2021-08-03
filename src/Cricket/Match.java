package Cricket;

public class Match {

    public static void main(String[] args) {

        int OverNumbers;
        int spinBowlersNumber;
        int fastMediumBowlersNumber;
        int fastBowlersNumber;
        int bowlerTypeNumber;

// initialize data
         OverNumbers=50;
         spinBowlersNumber=4;
         fastMediumBowlersNumber=2;
         fastBowlersNumber=3;
         bowlerTypeNumber=3;

         // classify every over update in UpdateScore Class

        ScoreUpdate scoreUpdate = new ScoreUpdate();



         // spinners listing

        SpinBowler [] spinBowlers = new SpinBowler[spinBowlersNumber];
        spinBowlers[0] = new SpinBowler("Shakib Al Hasan");
        spinBowlers[1] = new SpinBowler("Mahmudullah Riyad");
        spinBowlers[2] = new SpinBowler("Mehedi Miraz");
        spinBowlers[3] = new SpinBowler("Taijul Islam");

        // medium fast bowlers listing

        FastMediumBowler [] fastMediumBowlers = new FastMediumBowler[fastMediumBowlersNumber];

        fastMediumBowlers[0] = new FastMediumBowler("Mohammad Saifuddin");
        fastMediumBowlers[1] = new FastMediumBowler("Sauyma Sarkar");

        // fast bowlers listing


        FastBowler [] fastBowlers = new FastBowler[fastBowlersNumber];

        fastBowlers[0] = new FastBowler("Mustafizur Rahman");
        fastBowlers[1] = new FastBowler("Rubel Hossain");
        fastBowlers[2] = new FastBowler("Taskin Ahmed");

        int iterator=0;
        int jterator=0;


        // Start Over

        for(iterator=0;iterator<OverNumbers;iterator++){

            int bowlerType = (int) (Math.random()*bowlerTypeNumber)+1;
            int currentBowler=0;
            if(bowlerType==1){
                currentBowler = (int) (Math.random()*spinBowlersNumber);
                for(jterator=1;jterator<=6;jterator++){

                    int ballNo = (iterator*6)+jterator;
                    scoreUpdate.bowlingUpdate(spinBowlers[currentBowler],iterator,jterator);


                }
                spinBowlers[currentBowler].totalOver++;

            }
            else  if(bowlerType==2){
                currentBowler = (int) (Math.random()*fastMediumBowlersNumber);
                for(jterator=1;jterator<=6;jterator++){
                    int ballNo = (iterator*6)+jterator;
                    int currentSpeed=fastMediumBowlers[currentBowler].setBowlingSpeed(fastMediumBowlers[currentBowler].upperSpeed,
                            fastMediumBowlers[currentBowler].lowerSpeed);
                    System.out.println(ballNo+" th ball, " +
                            fastMediumBowlers[currentBowler].name+" at ," +
                            currentSpeed+" Km/h");
                    Double floatSpeed = new Double(currentSpeed);
                    fastMediumBowlers[currentBowler].totalSpeed+=floatSpeed;
                }
                fastMediumBowlers[currentBowler].totalOver++;

            }
            else  if(bowlerType==3){
                currentBowler = (int) (Math.random()*fastBowlersNumber);
                for(jterator=1;jterator<=6;jterator++){
                    int ballNo = (iterator*6)+jterator;




                }
                fastBowlers[currentBowler].totalOver++;
            }

        }

        BowlingAnalysis bowlingAnalysis = new BowlingAnalysis();
        bowlingAnalysis.BowlerStatistics(spinBowlers,fastMediumBowlers,fastBowlers,spinBowlersNumber,fastMediumBowlersNumber,fastBowlersNumber);

    }
}
