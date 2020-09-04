package com.company;

public class Car {
                static int x=11;
                private int y=33;
                public void method1(int x){
                    Car t=new Car();
                    this.x=22;
                    y=44;
                    System.out.println("Test.x: "+Car.x);
                    System.out.println("t.x: "+t.x);
                    System.out.println("t.y: "+t.y);
                    System.out.println("y: "+y);
                }


}
