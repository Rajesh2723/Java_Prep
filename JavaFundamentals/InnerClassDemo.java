package JavaFundamentals;

public class InnerClassDemo {
    
    private int outerfield=10;

    //Non-static Inner class --holds implicit reference to outer class
    class Inner{
        void show(){
            System.out.println("outerfield: "+outerfield);
        }
    }

    //static nested class - no reference to outer class
    static class StaticNestedClass{
        void show(){
            System.out.println("No access to outer instance fields here");
        }
    }

    //3.Local class defined inside a method.
    void localClassDemo(){
         class LocalHelper{
            void print(){
                System.out.println("Local class inside a method");
            }
         } new LocalHelper().print();
    }

    // 4. Anonymous class - no name, used for one-off implementations
    interface Greeting{
        void greet();
    }

    void anonymousDemo() {
        Greeting g = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello from anonymous class");
            }
        };
        g.greet();
    }
    
    public static void main(String[] args){
        InnerClassDemo outer = new InnerClassDemo();

        InnerClassDemo.Inner inner=outer.new Inner();

        inner.show();

        StaticNestedClass sr=new StaticNestedClass();
        sr.show();
    }


}
