package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
    isAnagram("ball","call");

    }
    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length()!=b.length()) return false;
        a=a.toLowerCase();
        b=b.toLowerCase();
        int count=0;

        for(char c='a';c<='z';c++){
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)==c){
                    count++;
                }
                if(b.charAt(i)==c){
                    count--;
                }
            }


            if(count!=0) {
                return false;
            }
        }

        return true;
    }

}






