package Oops.Abstraction;

abstract class Vehicle {
    abstract void start(); // contract - no implementation here

    void honk(){        // can also have shared concrete shared behaviour
        System.out.println("Beep beep");
    }
}

class Car extends Vehicle{

    @Override
    void start() {
        System.out.println("Car starts with the key button");
    }    
}

//Vehical -> Car ->ElectricalCar  (Multilevel inheritance)
class ElectricCar extends Car{
    @Override
    void start(){
        System.out.println("Electric car starts silently");
    }
}
