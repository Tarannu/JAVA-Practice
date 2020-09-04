package com.company;

public class Lorry extends Car {
    int wheelThickness;
    public Lorry(String name, int doors, String engine, int wheels,int wheelThickness) {
        super(name, doors, engine, wheels);
        this.wheelThickness=wheelThickness;
    }
    public int getWheelThickness(){return wheelThickness;}
    public void setWheelThickness(int wheelThickness){this.wheelThickness=wheelThickness;}
    public void goOnHeavyMode(){System.out.println("The lory has been loaded with heavy goods");}
}
