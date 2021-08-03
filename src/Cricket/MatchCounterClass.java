package Cricket;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MatchCounterClass {

    public int getMatchNumbers(){

        File matchFile = new File("/Cricket/MatchCounter.txt");
        char [] matchNumberChar = new char[6];
        try {
            FileReader fileReader = new FileReader(matchFile);
            fileReader.read(matchNumberChar);
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


        return 1;
    }

}
