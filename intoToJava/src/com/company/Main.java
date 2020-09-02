package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Printer page=new Printer(50,3,1,"Simplex");
    System.out.println("The ink level in the printer is "+page.getInkLevel());
    page.fillUpCartidge();
    System.out.println("The ink level in the printer after fill up is  "+page.getInkLevel());

    page.printPage();

    page.printingQueue(5);


    }
}
