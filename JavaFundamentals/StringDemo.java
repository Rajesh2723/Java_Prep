package JavaFundamentals;

public class StringDemo {
    public static void main(String[] args){
        String s1="Hello"; //goes to string pool
        String s2="Hello"; //points to same pool object

        //When the JVM processes "Hello", it checks the String Pool first. If the value already exists, it reuses the reference rather than creating a new object.
        //Therefore, both s1 and s2 point to the exact same object in memory (s1 == s2 evaluates to true

        String s3=new String("Hello"); //forces a new heap object

        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s1.equals(s3)); //same content

        System.out.println(s1==s3.intern()); //true intern return pool reference

        //Every modification creates new object
        //string cannot be modified since string class having final return type
        String s="abc";
        s.concat("def"); //result discared still abc ,//thread safe
        s=s.concat("def"); //must reassign

        //not a thread  safe, string modifications are allowed.
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<5;i++){
            sb.append(i).append(",");
        }

        sb.reverse();

         // StringBuffer - same API as StringBuilder, but thread-safe (synchronized methods)
        StringBuffer buf = new StringBuffer("safe");
        buf.append("-multithreaded");

        System.out.println(buf);
        
        //unchecked exceptions are a/b arithmatic NPE kind of exceptions
        //checked exceptions are user defined exceptions.
    }
}
