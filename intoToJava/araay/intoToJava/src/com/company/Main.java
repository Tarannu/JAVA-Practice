package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] First=new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] Second= new int[10];
        Second=First;
        for(int i=0;i<First.length;i++){
            System.out.println("The elements of the array at "+i+" is "+First[i]);
        }
        First[3]=20;
        for(int i=0;i<Second.length;i++){
            System.out.println("The elements of the Second array at "+i+" is "+First[i]);
        }
        //The element of the second array will change at the 3rd index to 20 since the second array is equal
        //to first array. So when the value is changed after printing initial first array the second array value changes.

    }
}
