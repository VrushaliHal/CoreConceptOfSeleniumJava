package conceptOfThread;

public class MyThreadRunnable {
    public static void main(String[] args) {

        MyThreadRun mt1 = new MyThreadRun();
        Thread t1 =new Thread(mt1);
        System.out.println("T1 Thread State: "+t1.getState());
        MyThreadRunTwo mt2 = new MyThreadRunTwo();
        Thread t2 = new Thread(mt2);
        System.out.println("T2 Thread State: "+t2.getState());

        t1.start();
        System.out.println("T1 Thread State: "+t1.getState());
        t2.start();
        System.out.println("T2 Thread State: "+t2.getState());

        System.out.println("T1 Thread State: "+t1.getState());
        System.out.println("T2 Thread State: "+t2.getState());

        System.out.println("T1 Thread State: "+t1.getState());
        System.out.println("T2 Thread State: "+t2.getState());


    }
}
