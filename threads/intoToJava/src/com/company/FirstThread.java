package com.company;

public class FirstThread extends Thread{
    public FirstThread(String name){
        super(name);
    }

    @Override
    public void run(){
        System.out.println("\033[34m Table printing task START at the thread 1 with name - \u001B[0m"+Thread.currentThread().getName());
        for (int i = 1; i < 10; i++) {
            int n = 4;
            int result = n * i;
            System.out.print("\033[34mThe table of 4 \u001B[0m"+i+"*"+n+"="+result+"\n");
        }
        }
    }

