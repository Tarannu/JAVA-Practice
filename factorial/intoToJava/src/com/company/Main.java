package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int result=1;
	    Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number you want a factorial of ");
	    int a=in.nextInt();

	    for(int i=1;i<=a;i++){
	        result*=i;


        }
	    System.out.println("The Factorial of "+a+" is "+result);







    }
}
