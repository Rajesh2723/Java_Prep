package JavaFundamentals;

public class DataTypesDemo {
    public static void main(String[] args){
        //Primitive types - stored on stack, fixed size
        //Autoboxing and unboxing simplify code by automatically converting between primitives
        //Wrapper Classes: Objects like Integer, Double, and Boolean that wrap primitives so they can be used in collections.
        //Primitives live directly on the Stack (fast access). Reference objects live on the Heap, while their pointers sit on the Stack.
        Integer a1 = 127, a2 = 127;
        Integer b1 = 128, b2 = 128;
        System.out.println(a1 == a2);     // true  (Integer cache: -128 to 127)
        System.out.println(b1 == b2);     // false (outside cache, different objects)


        // Integer overflow - SDE-2 favorite gotcha
        int max = Integer.MAX_VALUE;      // 2147483647
        System.out.println(max + 1);      // -2147483648 (silent overflow, no exception!)

        //== compares references for objects (Integer, String), .equals() compares values


    }
}
