package LLD;


//Swap algorithms/behavior at runtime without changing the client code.
//Need to go home from office->home, by walk,car,Bike
//we just calculateRouter which is later picks the suitable one, strategy way.

interface PaymentStrategy{
    void pay(int amount);
}

class UPI implements PaymentStrategy{
    public void pay(int amount){
        System.out.println("Amount paid using UPI :"+amount);
    }
}

class CreditCard implements PaymentStrategy{
    public void pay(int amount){
        System.out.println("Amount paid using Credit card:"+amount);
    }
}

class ShoppingCart{
    PaymentStrategy paymentStrategy;

    ShoppingCart(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }

    void checkout(){
        paymentStrategy.pay(1000);
    }
}



public class StrategyDesignPattern {
    public static void main(String[] args){
        ShoppingCart cart=new ShoppingCart(new CreditCard());
        cart.checkout();
    }
}
