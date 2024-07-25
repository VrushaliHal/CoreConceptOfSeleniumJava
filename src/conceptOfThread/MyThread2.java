package conceptOfThread;

public class MyThread2  extends Thread {
    @Override
    public void run() {
        int i=0;
        while (i < 10 ) {
            System.out.println("My threadTwo is Runnning. ");
            System.out.println("Thread2 :=> I am happy ! ");
            i++;
        }
    }
}
