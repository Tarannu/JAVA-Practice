package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Car myCar=new Car("Corolla",4,"Oil Engine",4);
    Car myPersonalCar=new PersonalCar("Cooper",4,"Oil Engine",4,20);
    PersonalCar myNewCar=new PersonalCar("Camry",4,"oil Engine",4,20);
    Car mySUV=new SUV("Toyota",4,"oil Engine",4,6);

    myPersonalCar.startEngine();
    mySUV.accelerate();
    myNewCar.goOnChildSafety();

    /* Here the Inheritance was used when PersonalCar, Lorry and SUV child class was extended from the parent class car. There the child classes inherited methods and attributes
    ie, engine, name, doors and wheels. Each child class had its own unique attribute/variable added to the constructor along with the inherited  attributes.

    To show polymorphism in the main class the Car class creates several objects for example it creates myPersonalCar and mySUV which uses child classes to PersonalCar and SUB
    to create the objects.*/
}
}


