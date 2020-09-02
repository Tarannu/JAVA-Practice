package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Printer {
    private int inkLevel,noOfPagesLeft,noOfPagesPrinted;
    private String printerType;
    private Queue<Integer> docQueue=new LinkedList<>();
    public Printer(int inkLevel,int noOfPagesLeft,int noOfPagesPrinted,String printerType){
        setInkLevel(inkLevel);
        this.noOfPagesLeft=noOfPagesLeft;
        this.noOfPagesPrinted=noOfPagesPrinted;
        this.printerType=printerType;
    }
    public String getPrinterType(){
        return this.printerType;

    }
    public void setPrinterType(String new_printer){
        this.printerType=new_printer;
    }

    public int getInkLevel(){
        return this.inkLevel;
    }
    public void setInkLevel(int new_inkLevel) {
        if (new_inkLevel <= 100) {
            this.inkLevel = new_inkLevel;
        } else{
            System.out.println("Invalid Ink Level should be within 100");
        }
    }
    public void fillUpCartidge(){
        //if getInkLevel < 100 set inkLevel 100
        int inkLevel=this.inkLevel;
        if(inkLevel<100){
            setInkLevel(100);
        }
    }
    public void printPage(){
        //simulate printing a page
        //which should increase the number of pages printed
        // and decrease number of paper left
        int noOfPagesPrinted=this.noOfPagesPrinted;
        int noOfPagesLeft=this.noOfPagesLeft;
        noOfPagesLeft--;
        noOfPagesPrinted++;
        if(noOfPagesLeft==0){
            System.out.println("Error! Please refill the pages to print.");
        }
        else System.out.println("No of pages printed so far "+noOfPagesPrinted+" and No of pages left "+noOfPagesLeft);
    }
    public Queue<Integer> getQueue() {
        return this.docQueue;
    }
    public void addToQueue(int queue){
        //adding encapsulation to the @addToQueue method
        if(inkLevel==0||noOfPagesLeft==0){
            System.out.println("Need ink Refill or page refill");
        }
        getQueue();
        for(int i=0;i<queue;i++){
        this.docQueue.add(i);
        }
        System.out.println("An integer to printing queue has been added");
    }
    public void removeFromQueue(){
        getQueue();
        docQueue.poll();
        System.out.println("An integer from printing queue has been removed");
    }
    public void printingQueue(int queue) {

        getQueue();
        addToQueue(queue);
        System.out.println("The printing queue after adding document" + docQueue);
        removeFromQueue();
        System.out.println("After the printing of a document is done the current queue is"+docQueue);
    }


    }




