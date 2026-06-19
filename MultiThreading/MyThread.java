package MultiThreading;

class MyTask extends Thread {

    public void run() {

        try {
            Thread.sleep(3000);
        } catch(Exception e) {
        }
    }
}

public class MyThread {

    public static void main(String[] args)
            throws Exception {

        MyTask t1 = new MyTask();

        System.out.println("1. " + t1.getState());

        t1.start();

        System.out.println("2. " + t1.getState());

        Thread.sleep(500);

        System.out.println("3. " + t1.getState());

        t1.join();

        System.out.println("4. " + t1.getState());
    }
}