package JavaFundamentals;

public class MethodsDemo {
    //overloading : same name : different parameter list (static binding/compile-time)
    static int add(int a,int b){return a + b ;}
    static double add(double a ,double b){return a+b;}
    static int add(int a,int b,int c){return a+b+c;}

    public static void main(String[] args){
        System.out.println(add(2,3));
        System.out.println(add(2.1,3.1));
        System.out.println(add(2,3,4));
    }

}
