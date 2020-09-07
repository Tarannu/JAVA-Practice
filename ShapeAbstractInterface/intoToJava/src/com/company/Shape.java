package com.company;

public abstract class Shape {
    private int numSides;
    public Shape(int numSides){
        this.numSides=numSides;
    }
    public int getNumSides(int numSides){
        return numSides;
    }
    public abstract int getArea();
    public abstract double getPerimeter();






}
