package com.company;

public class Animal {
    String name;
    int numberOfLegs;
    String animalSound,animalFood,habitat;

    public Animal(String name, String animalSound,String animalFood,String habitat){
        this.name=name;
        this.animalSound=animalSound;
        this.animalFood=animalFood;
        this.habitat=habitat;
    }
    public int makeSound(int x){
        System.out.println("The sound the animal makes is "+x);
        return x;
    }
    public void eat(){
        //this.animalFood=y;
        System.out.println("The food the animal eats is "+this.animalFood);
        //return y;
    }
}
