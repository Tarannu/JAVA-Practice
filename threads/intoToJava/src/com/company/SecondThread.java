package com.company;

public class SecondThread extends Thread{
    public SecondThread(String name){
        super(name);
    }
    @Override
    public void run(){
        setName("Anonymous Thread");
        System.out.println("\033[31m Table printing task START at the thread 2 with name - \u001B[0m"+Thread.currentThread().getName());
        for (int i = 1; i < 10; i++) {
            int n = 5;
            int result = n * i;
            System.out.print("\033[31m The table of 5 \u001B[0m"+i+"*"+n+"="+result+"\n");
        }
    }

}
