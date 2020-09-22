package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static string main(String s , int k) {
	// write your code here

            s="welcometojava"; k=3;
            String smallest = "";
            String largest = "";

            // Complete the function
            // 'smallest' must be the lexicographically smallest substring of length 'k'
            // 'largest' must be the lexicographically largest substring of length 'k'
            for(int i=0;i<=s.length()-k;i++){
                String sub=s.substring(i,i+k);

                if(sub.compareTo(smallest)<0||smallest.isEmpty()){
                    smallest=sub;

                }
                if(sub.compareTo(largest)>0||smallest.isEmpty()){
                    largest=sub;

                }


            }


            System.out.println(smallest + "\n" + largest);
        }

}






