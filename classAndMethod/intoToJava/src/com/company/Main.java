package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Animal lion=new Animal("Lion","roar","Meat","Africa");
    Animal deer=new Animal("Deer","screech","Grass","Africa");
    Animal bird=new Animal("Mcgill","chirp","Insect","world");

    lion.makeSound(3);
    lion.eat();

    deer.makeSound(3);
    deer.eat();

    bird.makeSound(3);
    bird.eat();

    }
}
