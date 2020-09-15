package com.company;

public class ThirdThread implements Runnable {


    @Override
    public void run() {
        System.out.println("\033[36m Table printing task START at the thread 3 with name - \u001B[0m" + Thread.currentThread().getName());
        for (int i = 1; i < 10; i++) {
            int n = 6;
            int result = n * i;
            System.out.print("\033[36m The table of 6 \u001B[0m" + i + "*" + n + "=" + result + "\n");
        }
    }
}
