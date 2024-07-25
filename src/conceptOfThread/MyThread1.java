package conceptOfThread;

public class MyThread1  extends Thread {
    @Override
    public void run() {
        int i=0;
        while (i < 10 ) {
            System.out.println("My threadOne is Runnning. ");
            System.out.println("Thread 1:=> I am happy ! ");
            i++;
        }
    }
}




