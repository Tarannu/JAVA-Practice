package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

                Scanner sc=new Scanner(System.in);
                String A=sc.next();
                /* Enter your code here. Print output to STDOUT. */
        String B = new StringBuffer(A).reverse().toString();

        if (B.equals(A))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

            }
        }





