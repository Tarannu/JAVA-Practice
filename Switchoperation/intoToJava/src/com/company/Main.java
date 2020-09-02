package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int result=0;
	    Scanner in = new Scanner(System.in);
        System.out.print("Please enter first number a ");
	    int a=in.nextInt();
        System.out.print("Please enter second number b ");
	    int b=in.nextInt();
        System.out.print("Please enter what operation Addition +, Summation - , Division  / or Multiplication * ");
	    char userInput=in.next().charAt(0);
        int symbol=Integer.valueOf(userInput);
	    //switch statements with int data type
        switch(symbol){
            case '+':
                result=a+b;
                System.out.println("The sum of a and b is "+result);
                break;
            case '-':
                result=a-b;
                System.out.println("The subtraction of b from a is "+result);
                break;
            case '/':
                result=a/b;
                System.out.println("The division of a by b is "+result);
                break;
            case '*':
                result=a*b;
                System.out.println("The multiplication of a and b is "+result);
                break;
            default:
                System.out.println("Invalid Operation");
                break;
        }

    }
}
