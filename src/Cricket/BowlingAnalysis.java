package Cricket;

public class BowlingAnalysis {
    public void BowlerStatistics(SpinBowler [] spinBowlers,
                                 FastMediumBowler [] fastMediumBowlers
            ,FastBowler [] fastBowlers, int spinBowlersNumber,
                                         int fastMediumBowlersNumber,
                                         int fastBowlersNumber){


        int iterator;
        System.out.println("Bowlers Bowling Analysis: ");

        for(iterator=0;iterator<spinBowlersNumber;iterator++){
          //  System.out.println("Total Speed:"+spinBowlers[iterator].totalSpeed);
            spinBowlers[iterator].averageSpeed = spinBowlers[iterator].totalSpeed/(spinBowlers[iterator].totalOver*6);
            System.out.println("Name : "+spinBowlers[iterator].name);
            System.out.println("Total Overs: "+spinBowlers[iterator].totalOver+", Avg Speed: "+spinBowlers[iterator].averageSpeed);
            System.out.println();
        }

        for(iterator=0;iterator<fastMediumBowlersNumber;iterator++){
            //System.out.println("Total Speed:"+fastMediumBowlers[iterator].totalSpeed);
            fastMediumBowlers[iterator].averageSpeed = fastMediumBowlers[iterator].totalSpeed/(fastMediumBowlers[iterator].totalOver*6);
            System.out.println("Name : "+fastMediumBowlers[iterator].name);
            System.out.println("Total Overs: "+fastMediumBowlers[iterator].totalOver+", Avg Speed: "+fastMediumBowlers[iterator].averageSpeed);
            System.out.println();
        }

        for(iterator=0;iterator<fastBowlersNumber;iterator++){
           // System.out.println("Total Speed:"+fastBowlers[iterator].totalSpeed);
            fastBowlers[iterator].averageSpeed = fastBowlers[iterator].totalSpeed/(fastBowlers[iterator].totalOver*6);
            System.out.println("Name : "+fastBowlers[iterator].name);
            System.out.println("Total Overs: "+fastBowlers[iterator].totalOver+", Avg Speed: "+fastBowlers[iterator].averageSpeed);
            System.out.println();
        }

    }
}
