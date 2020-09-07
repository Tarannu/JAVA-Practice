package com.company;

public class Rectangle extends Shape implements ReSize {
    private int width,height;
    public Rectangle(int numSides,int width,int height){
        super(numSides);
        this.width=width;
        this.height=height;
    }

    public int getWidth() {
        return width;
    }
    public int getHeight(){
        return height;
    }
    @Override
    public int getArea(){

        int area=getHeight()*getWidth();
        System.out.println("The area of Rectangle is: "+area);
        return area;

    }
    @Override
    public double getPerimeter(){

        int perimeter=2*(getHeight()+getWidth());
        System.out.println("The Perimeter of rectangle is: "+perimeter);

        return perimeter;
    }

    @Override
    public void ReSize(double x){
        double new_area=getArea()-x;
        double new_perimeter=getPerimeter()-x;

        System.out.println("The rezised new area of the rectangle is: "+new_area);
        System.out.println("The resized new perimeter is: "+new_perimeter);
    }
}
