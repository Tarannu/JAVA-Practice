package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your code here.
        if(!scan.hasNext()){
            System.out.println(0);
            return;
        }
        String s = scan.nextLine();
        String delim="[ ,._/$~:><+!&@#^$*&?';]+";
        String[] token=s.trim().split(delim);
        if(token.length>400000||token.length<1||token.length==0){
            System.out.println("0");
        }
        else System.out.println(token.length);
        for(String a:token){
            System.out.println(a);
        }

        scan.close();
    }
}

