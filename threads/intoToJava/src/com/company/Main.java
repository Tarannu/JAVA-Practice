package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws InterruptedException{
    //Thread t1=new FirstThread("T1",4);
    Thread t1=new FirstThread("Thread 1");
    Thread t2=new SecondThread("Thread 2");
    ThirdThread runnable=new ThirdThread();
    Thread t3=new Thread(runnable,"Thread 3");
    FourthThread runnable2=new FourthThread();
    Thread t4=new Thread(runnable2,"Thread 4");
    t4.setName("Anonymous Thread");

    System.out.println("\033[34m Starting First Thread  \u001B[0m");
    t1.start();

    System.out.println("\033[31m Starting Second Thread  \u001B[0m");
    t2.start();

    System.out.println("\033[36m Starting Third Thread  \u001B[0m");
    t3.start();

    System.out.println("\033[32m Starting Fourth Thread  \u001B[0m");
    t4.start();

    }
}

