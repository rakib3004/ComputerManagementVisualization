package ObjectOrientedConcepts;

import java.util.Scanner;

public class Overriding {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        Scanner scanner = new Scanner(System.in);
        int first, second;
        System.out.println("Enter two number: ");
        first = scanner.nextInt();
        second = scanner.nextInt();
       int sum= calculation.numberTheory(first,second);

        System.out.println("Sum is: "+sum);

    }
}

class Mathematics{

    int numberTheory(int aNumber, int bNumber){
        return  aNumber+bNumber;

    }

}

class Calculation extends Mathematics{

    @Override
    int numberTheory(int aNumber, int bNumber){

        int sumResult=0;
        int firstNumber,secondNumber;
        firstNumber=aNumber;
        secondNumber=bNumber;
        sumResult=firstNumber+secondNumber;
        return  sumResult;

    }

}