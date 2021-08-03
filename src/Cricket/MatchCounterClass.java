package Cricket;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MatchCounterClass {

    public int getMatchNumbers(){

        File matchFile = new File("/MatchCounter.txt");

        try {
            FileReader fileReader = new FileReader(matchFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }




        return 1;
    }

}
