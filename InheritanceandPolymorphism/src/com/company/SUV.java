package com.company;

public class SUV extends Car{
    int seatNo;
    public SUV(String name, int doors, String engine, int wheels,int seatNo) {
        super(name, doors, engine, wheels);
        this.seatNo=seatNo;
    }
    public int getSeatNo(){return seatNo;}
    public void setSeatNo(int seatNo){this.seatNo=seatNo;}
    public void goOnCruise(){System.out.println("The accelerator is on steady cruise mode");}
}
