package Oops.Inheritance;

class Animal {
    Animal(){
        System.out.println("Animal makes sound constructor");
    }
    //parameter constructor

    Animal(String sound){
        System.out.println("Animal makes sound from parameter constructor: " +sound);
    }
}

class Dog extends Animal{
    Dog(){
        super("Woof");  //explicit call to 1-arg constructor
        System.out.println("This is in the Dog constructor");
    }
}

class ConstructorDemo{
    public static void main(String[] args){
        new Dog();
    }
}
