package Cricket;

import java.io.*;

public class MatchCounterClass {

    public static int getMatchNumbers(){

        File matchFile = new File("MatchCounter.txt");
        char [] matchNumberChar = new char[6];
        try {
            FileReader fileReader = new FileReader(matchFile);
            fileReader.read(matchNumberChar);
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int iter;
        String matchNum="";

        for(iter=0;matchNumberChar[iter]!='\0'; iter++){
            matchNum= matchNum+matchNumberChar[iter];
        }

        int mNumber = Integer.parseInt(matchNum);
        mNumber++;

        System.out.println(mNumber);

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(matchFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileWriter.write(String.valueOf(mNumber));
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return mNumber;
    }

    public static void main(String[] args) {
        getMatchNumbers();
    }

}
