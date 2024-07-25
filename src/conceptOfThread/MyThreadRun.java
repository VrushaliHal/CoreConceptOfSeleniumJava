package conceptOfThread;

public class MyThreadRun implements Runnable{
    @Override
    public void run() {
        int i =0;
        while (i<5) {
            System.out.println(" Thread One. ");
            i++;
        }
    }
}
