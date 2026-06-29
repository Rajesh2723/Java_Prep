package LLD;

public class Singleton{

    //volatile->every thread sees the same thread.if thread A created and it points to thread B as it wont create again.

    private static volatile Singleton instance;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(instance==null){
            synchronized(Singleton.class){
                if(instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
}


class Main{
    public static void main(String[] args){
        Singleton s = Singleton.getInstance();
        System.out.println(s);

        Singleton s1 = Singleton.getInstance();
        System.out.println(s1==s);

    }
}   