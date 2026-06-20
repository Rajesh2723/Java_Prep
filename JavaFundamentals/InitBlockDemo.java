package JavaFundamentals;

public class InitBlockDemo {
    static  int staticVar;
    int instanceVar;

    //static block runs once when the class first loaded ,before main()
    static{
        System.out.println("1. Static block (class loading)");
        staticVar=100;
    }

    //Instance initializer block- runs everytime object is created.
    //After static blocks,before constructor body, in declaration order.

    {
        System.out.println("3. Instance block (per-object creation)");
        instanceVar=10;
    }

    public InitBlockDemo(){
        System.out.println("4.constructor body");
    }

    static{
        System.out.println("2. second static block executes in order");
    }

    public static void main(String[] args){
        System.out.println("--------main starts---------");

        new InitBlockDemo();
        System.out.println("-----creating second object----");

        new InitBlockDemo(); // static blocks DON'T re-run, instance blocks DO
    }

}
