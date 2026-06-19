package MultiThreading;

//1st way of creating thread.
class MyThread extends Thread{

    @Override
    public void run(){
        System.out.println("Thread is running");
    }
}

public class Main{ //Main thread
    public static void main(String []args){
        // for(int i=0;i<5;i++){
        //     System.out.println(i);
        // }

        MyThread t1 = new MyThread();
        t1.start(); //JVM managees execution
        //t1.run();//runs sequential
        //JVM does?
        //create new thread
        //allocates stack memory
        //schedules thread
        //Calls run

        System.out.println(Thread.currentThread().getName());

        //running runnable interface
        Thread t2=new Thread(new MyTask());
        t2.start();
        System.out.println(t2.getState());
    }
}

//2nd way of creating thread using Runnable.
//preferred way of creating threads
//Java doesn't support multiple inheritance.
class MyTask implements Runnable{
    @Override
    public void run(){
        System.out.println("Runnable executed");
    }
}

