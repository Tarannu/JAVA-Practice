package com.company;

public class PersonalCar extends Car{
    private int height;
    public PersonalCar(String name, int doors, String engine, int wheels,int height) {
        super(name, doors, engine, wheels);
        this.height=height;
    }
    public int getHeight(){return height;}
    public void setHeight(int height){this.height=height;}
    public void goOnChildSafety(){System.out.println("Child safety has been turned on");}
}

