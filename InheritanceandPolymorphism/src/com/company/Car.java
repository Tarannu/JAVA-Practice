package com.company;

public class Car {
        private String engine;
        private String name;
        private int doors;
        private int wheels;

        public Car(String name,int doors,String engine,int wheels){
            this.name=name;
            this.doors=doors;
            this.engine=engine;
            this.wheels=wheels;
        }

        public String getName(){ return name; }
        public void setName(String name){this.name=name;}
        public int getDoors(){ return doors; }
        public void setDoors(int doors){this.doors=doors;}
        public String getEngine(){ return engine; }
        public void setEngine(String engine){this.engine=engine;}
        public int getWheels(){return wheels;}
        public void setWheels(int wheels){this.wheels=wheels;}

        public void startEngine(){
            System.out.println("Engine has started" );
        }
        public void accelerate(){
            System.out.println("Engine Accelerated");
        }
        public void brake(){
            System.out.println("Engine braked ");
        }



}
