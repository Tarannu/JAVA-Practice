package com.company;

public class FourthThread implements Runnable {
    @Override
    public void run() {

        System.out.println("\033[32m Table printing task START at the thread 4 with name - \u001B[0m" + Thread.currentThread().getName());
        for (int i = 1; i < 10; i++) {
            int n = 7;
            int result = n * i;
            System.out.print("\033[32m The table of 7 \u001B[0m" + i + "*" + n + "=" + result + "\n");
        }
    }
}
