package ObjectOrientedConcepts;

import javafx.scene.chart.NumberAxis;

import java.util.Scanner;

public class Overloading {
    public static void main(String[] args) {

        int aInt, bInt;
        double aDouble, bDouble;
        NumericalAnalysis numericalAnalysis = new NumericalAnalysis();


        System.out.println("What do you want???\n1.Interger Addition\n2.Double Addition\n");
        int getOpt;
        Scanner scanner = new Scanner(System.in);
        getOpt = scanner.nextInt();
        if(getOpt==1){

            System.out.println("Enter two integer number:");
            aInt = scanner.nextInt();
            bInt = scanner.nextInt();

            int getKey;
            System.out.println("Press 1 for addition, press 2 for subtraction");
            getKey = scanner.nextInt();

            if (getKey==1){
                System.out.println("Sum is "+numericalAnalysis.addition(aInt,bInt));
            }
            else {
                System.out.println("Subtract is "+numericalAnalysis.subtraction(aInt,bInt));
            }


        }

        else {

            System.out.println("Enter two double number:");
            aDouble = scanner.nextDouble();
            bDouble = scanner.nextDouble();

            int getKey;
            System.out.println("Press 1 for addition, press 2 for subtraction");
            getKey = scanner.nextInt();


            if (getKey==1){
                System.out.println("Sum is "+numericalAnalysis.addition(aDouble,bDouble));
            }
            else {
                System.out.println("Subtract is "+numericalAnalysis.subtraction(aDouble,bDouble));
            }

        }
    }
}

class NumericalAnalysis{

int addition(int a, int b){
    return  a+b;
}
double addition(double c, double d){
    return  c+d;
}

int subtraction(int a , int b){
    return  a-b;
}
double subtraction(double c, double d){
    return  c-d;
}

}