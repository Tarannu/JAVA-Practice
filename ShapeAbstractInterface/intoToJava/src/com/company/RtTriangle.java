package com.company;

public class RtTriangle extends Shape {
    private int base,height;
    public RtTriangle(int numSides,int base,int height){
        super(numSides);
        this.base=base;
        this.height=height;
    }
    public int getBase(){
        return base;
    }
    public int getHeight(){
        return height;
    }

    @Override
    public int getArea() {

        double area = 0.5 * (getHeight() * getBase());
        System.out.println("The area of Triangle is: " + area);
        return 0;
    }

    @Override
    public double getPerimeter(){
        System.out.println("To find perimeter a Pythagorus formula has to be applied");
    return 0;
    }

}
