package Cricket;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BowlingAnalysis {
    public void BowlerStatistics(SpinBowler [] spinBowlers,
                                 FastMediumBowler [] fastMediumBowlers
            ,FastBowler [] fastBowlers, int spinBowlersNumber,
                                         int fastMediumBowlersNumber,
                                         int fastBowlersNumber){

        MatchCounterClass matchCounterClass = new MatchCounterClass();
        String matchDescription;
        String iEnd;
                iEnd="\n";
                matchDescription="Match No:";
        int matchNo = matchCounterClass.getMatchNumbers();

        Date matchDay = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E dd.MM.yyyy");


        // add data and information
        matchDescription+=matchNo+", "+simpleDateFormat.format(matchDay)+"\n";

        String dashString = "\n---------------------------------------------------\n";
        String bbAnalysis = "Bowlers Bowling Analysis: \n";

        // add data and information
        matchDescription=matchDescription+dashString+bbAnalysis;

        int iterator;
        System.out.println(dashString);
        System.out.println(bbAnalysis);
        for(iterator=0;iterator<spinBowlersNumber;iterator++){
          //  System.out.println("Total Speed:"+spinBowlers[iterator].totalSpeed);
            spinBowlers[iterator].averageSpeed = spinBowlers[iterator].totalSpeed/(spinBowlers[iterator].totalOver*6);

            // add data and information
            matchDescription+= "Name : "+spinBowlers[iterator].name+iEnd+"Total Overs: "+spinBowlers[iterator].totalOver+", Avg Speed: "+spinBowlers[iterator].averageSpeed+iEnd;

            System.out.println("Name : "+spinBowlers[iterator].name);
            System.out.println("Total Overs: "+spinBowlers[iterator].totalOver+", Avg Speed: "+spinBowlers[iterator].averageSpeed);
            System.out.println();
        }

        for(iterator=0;iterator<fastMediumBowlersNumber;iterator++){
            //System.out.println("Total Speed:"+fastMediumBowlers[iterator].totalSpeed);


            fastMediumBowlers[iterator].averageSpeed = fastMediumBowlers[iterator].totalSpeed/(fastMediumBowlers[iterator].totalOver*6);
            // add data and information
            matchDescription+= "Name : "+fastMediumBowlers[iterator].name+iEnd+"Total Overs: "+fastMediumBowlers[iterator].totalOver+", Avg Speed: "+fastMediumBowlers[iterator].averageSpeed+iEnd;

            System.out.println("Name : "+fastMediumBowlers[iterator].name);
            System.out.println("Total Overs: "+fastMediumBowlers[iterator].totalOver+", Avg Speed: "+fastMediumBowlers[iterator].averageSpeed);
            System.out.println();
        }

        for(iterator=0;iterator<fastBowlersNumber;iterator++){
           // System.out.println("Total Speed:"+fastBowlers[iterator].totalSpeed);

            fastBowlers[iterator].averageSpeed = fastBowlers[iterator].totalSpeed/(fastBowlers[iterator].totalOver*6);
            // add data and information
            matchDescription+= "Name : "+fastBowlers[iterator].name+iEnd+"Total Overs: "+fastBowlers[iterator].totalOver+", Avg Speed: "+fastBowlers[iterator].averageSpeed+iEnd;


            System.out.println("Name : "+fastBowlers[iterator].name);
            System.out.println("Total Overs: "+fastBowlers[iterator].totalOver+", Avg Speed: "+fastBowlers[iterator].averageSpeed);
            System.out.println();
        }
  matchDescription+=dashString+iEnd+iEnd;

      File recordFile  = new File("MatchRecordBook.txt");


        /*  FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(recordFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileWriter.append((matchDescription));
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        */


      BufferedWriter bufferedWriter = null;
          try {
                bufferedWriter = new BufferedWriter(
                        new FileWriter(recordFile, true));
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedWriter.write(matchDescription);
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}
