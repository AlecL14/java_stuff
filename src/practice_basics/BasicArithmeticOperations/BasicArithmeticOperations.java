package src.practice_basics.BasicArithmeticOperations;

import java.util.Scanner;

public class BasicArithmeticOperations{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numA = sc.nextInt();
        int numB = sc.nextInt();

        System.out.println(numA + " + " + numB + " = " + (numA + numB));
        System.out.println(numA + " - " + numB + " = " + (numA - numB));
        System.out.println(numA + " * " + numB + " = " + (numA * numB));
        System.out.println(numA + " / " + numB + " = " + (numA / numB));
        System.out.println(numA + " % " + numB + " = " + (numA % numB));
        
        sc.close();
    }
}