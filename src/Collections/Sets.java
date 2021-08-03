package Collections;

import java.util.*;

public class Sets {
    public static void main(String[] args) {
        // create and display a List< String >

        String [] colors = {"red","red","red","red","megenda","ice-color","spring-green","red","red","red","red","red","red","red","white","blue","green","gray","orange","tan","white","cyan","peach","gray","orange"};

        List<String> list = Arrays.asList(colors);

        System.out.println("List: "+list);
        System.out.println();
        // eliminate duplicates then print the unique values

  printNonDuplicates(list);
    }
    // end main

    private  static void printNonDuplicates(Collection <String> values){

        // create a HashSet

        Set <String> set  = new HashSet<String>(values);

        System.out.println("\nNonduplicates are: ");

        for(String value: set)
            System.out.println(value+" ");

        System.out.println();

    }// end printNonDuplicates Method
}// end Set Class
