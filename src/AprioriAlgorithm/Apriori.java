package AprioriAlgorithm;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


class Pair{
    String first;
    int second;
    public Pair(String x, int y){
        this.first = x;
        this.second = y;
    }
}
public class Apriori {
    public static void main(String[] args) throws FileNotFoundException {




        File myObj = new File("src" + File.separator + "Data" + File.separator + "database.txt");

        Scanner myReader = new Scanner(myObj);
        ArrayList<ArrayList<String>> transactions = new ArrayList<>();
        ArrayList<String>allTrans = new ArrayList<>();

        while (myReader.hasNextLine()) {
            ArrayList<String>temp = new ArrayList<>();
            String data = myReader.nextLine();
            String newData = data.substring(5,data.length());
            newData = data.replaceAll("\\s", "");

            String[] arrOfStr = data.split(",", 0);
            String[] newArr = newData.split(",", 0);
            int index = 0;
            String whole = "";

            for(String a:newArr){
                whole+=a;
            }
            allTrans.add(whole);
            for (String a : arrOfStr){
                String tmp = a;
                if(index==0){
                    int i=0;
                    while(a.charAt(i)>97){
                        i++;
                    }
                    tmp = a.substring(i, a.length());
                    index++;
                }
                if(tmp.trim()!="" && !temp.contains(tmp.trim())){
                    temp.add(tmp.trim());
                }
            }
            transactions.add(temp);
        }


        HashMap<String, Integer> mp = new HashMap<>();

        for(ArrayList<String> transaction : transactions){
            for(String item:transaction){
                if(mp.containsKey(item)){
                    mp.put(item, mp.get(item)+1);
                }
                else{
                    mp.put(item, 1);
                }
            }
        }
        for(String a: allTrans){
        }

        ArrayList<Pair> finalMp =    new ArrayList<>();
        //System.out.println(mp);
        mp.forEach((k, v)->{
            Pair p = new Pair(k,v);
            finalMp.add(p);
        });

        ArrayList<Pair> newMp =   new ArrayList<>();
        for(Pair p: finalMp){
            newMp.add(p);
        }
        for(String trx:allTrans){
        }
        int round = 1;
        while(true){
            for(Pair p: newMp){
            }
            round++;
            ArrayList<Pair> tempMp =    new ArrayList<>();
            for (int i=0; i<newMp.size(); i++){
                String item_1 = newMp.get(i).first;
                for (int j=i+1; j<newMp.size(); j++){
                    String item_2 = newMp.get(j).first;
                    if(item_1.length()==2){
                        String newItem = item_1+item_2.charAt(item_2.length()-2)+item_2.charAt(item_2.length()-1);
                        int supCount = 0;
                        for(int k=0; k<allTrans.size(); k++){
                            ArrayList<String> items = new ArrayList<>();
                            for(int l=0; item_1.charAt(l)!=','; l++){
                                String x = item_1.substring(l,l+1);
                                items.add(x);
                            }

                            for(int l=0; item_2.charAt(l)!=',';l+=2){
                                String x = item_2.substring(l,l+2);
                                if(!items.contains(x)){
                                    items.add(x);
                                }
                            }
                            boolean isPresent = true;
                            for(int l=0; l<items.size(); l++){
                                if(!allTrans.get(k).contains(items.get(l)))
                                    isPresent = false;
                            }
                            if(isPresent){
                                supCount++;
                            }
                        }
                        if(supCount>=2)finalMp.add(new Pair(newItem, supCount));
                        if(supCount>=2)tempMp.add(new Pair(newItem, supCount));
                    }
                    else {
                        String newItem = item_1+item_2.charAt(item_2.length()-2)+item_2.charAt(item_2.length()-1);
                        for(Pair items : finalMp){
                            if(items.first==newItem) continue;
                        }
                        if(item_1.charAt(item_1.length()-1)>=item_2.charAt(item_2.length()-1)){
                            continue;
                        }
                        int supCount = 0;
                        for(int k=0; k<allTrans.size(); k++){
                            ArrayList<String> items = new ArrayList<>();
                            for(int l=0; l<item_1.length(); l+=2){
                                String x = item_1.substring(l,l+2);
                                items.add(x);
                            }

                            for(int l=0; l<item_2.length(); l+=2){
                                String x = item_2.substring(l,l+2);
                                if(!items.contains(x)){
                                    items.add(x);
                                }
                            }
                            boolean isPresent = true;
                            for(int l=0; l<items.size(); l++){
                                if(!allTrans.get(k).contains(items.get(l)))
                                    isPresent = false;
                            }
                            if(isPresent){
                                supCount++;
                            }
                        }
                        if(supCount>=2) finalMp.add(new Pair(newItem, supCount));
                        if(supCount>=2) tempMp.add(new Pair(newItem, supCount));
                    }
                }
            }
            if(tempMp.isEmpty()) break;
            if(tempMp.size()<=1){
                break;
            }
            newMp.clear();
            boolean Valid = false;
            for(Pair items : tempMp){
                newMp.add(items);
                if(items.second>=2) Valid = true;
            }

            tempMp.clear();
            if(!Valid) break;
        }

        newMp.clear();
        Set<String>s = new HashSet<>();
        for(Pair p: finalMp){
            s.add(p.first);
        }
        HashMap<String, Integer> ans = new HashMap<>();
        for(Pair p: finalMp){
            if(s.contains(p.first)){
                s.remove(p.first);
                ans.put(p.first, p.second);
            }
        }
        for(Pair p : newMp)
            //System.out.println(p.first + " " + p.second);
            myReader.close();
        Scanner scan = new Scanner(System.in);
        String input_1 = scan.nextLine();
        String input_2 = scan.nextLine();
        ArrayList<String>itemListA = new ArrayList<>();
        ArrayList<String>union = new ArrayList<>();

        for(int l=0; l<input_1.length(); l+=2){
            String x = input_1.substring(l,l+2);
            itemListA.add(x);
            union.add(x);
        }
        Collections.sort(itemListA);
        String itemA = "";
        for(String string : itemListA){
            itemA+=string;
        }
        for(int l=0; l<input_2.length(); l+=2){
            String x = input_2.substring(l,l+2);
            //System.out.println("x " + x);
            if(!union.contains(x)){
                union.add(x);
            }
        }
        String Union = "";
        for(String string : union){
            Union+=string;
        }
        Collections.sort(union);
        //System.out.println(itemA);
        //System.out.println(Union);
        //System.out.println(ans.get(Union));
        //System.out.println(itemA);
        //System.out.println(ans.get(itemA));
        if(ans.containsKey(Union)==false || ans.containsKey(itemA)==false){
            System.out.println("One of the itemset is not frequent");
            return ;
        }
        double num = ans.get(Union);
        double den = ans.get(itemA);
        double result = num/den;
        System.out.println( result);
    }

}