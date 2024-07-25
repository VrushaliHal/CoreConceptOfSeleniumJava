package conceptOfThread;

public class MyThreadRunTwo implements Runnable{

    @Override
    public void run() {
        int i =0;
        while (i<5) {
            System.out.println(" Thread Two. ");
            i++;
        }

    }
}
