package Oops.Abstraction;

public class AbstracDemo {
    
    public static void main(String[] args){

        //====Polymorphism
        //compille-time (static) == method overloading , resolved by signature
        //Runtime polymorphism == method overriding , resolved by actual object type

        Vehicle v1 =new Car();
        Vehicle v2=new ElectricCar();
        v1.start();
        v2.start();

        // The reference type is Vehicle, but the JVM looks at the ACTUAL object
        // to decide which start() to call - this is dynamic method dispatch.

        Vehicle[] fleet={new Car(), new ElectricCar()};
        for(Vehicle v:fleet){
            v.start();
        }
    }
}
