package Oops.Encapsulation;

public class Encap {
    private double balance;

    public Encap(double initalBalance){
        this.balance=initalBalance;
    }
    public double getBlance(){
        return balance;
    }

    public void Deposit(double amount){
        if(amount>0)balance+=amount;
    }   
}

// //Abstraction -- exposing what an object does, hiding HOW ======
// abstract class Vehicle{
//      abstract void start(); //contract -- No implementation here

//     void honk(){
//         System.out.println("Beep Beep !");
//     }
// }


