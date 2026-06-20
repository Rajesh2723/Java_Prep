package Oops;
import Oops.Encapsulation.Encap;

public class BankAccountDetails {
    public static void main(String[] args){
        Encap en=new Encap(500);

        en.Deposit(300);

        System.out.println(en.getBlance());

        en.setBalance(-500);
    }   
}
