package conceptOfThread;



public class ThreadCapacity extends Thread {

     @Override
     public void run() {

         int i = 0;
         while (i < 6) {
             System.out.println(" Running. "+this.getName());

             i++;
         }

     }

    public static void main(String[] args) {

         ThreadCapacity thr1 = new ThreadCapacity();
         ThreadCapacity thr2 = new ThreadCapacity();
        ThreadCapacity thr3 = new ThreadCapacity();
        ThreadCapacity thr4 = new ThreadCapacity();
        ThreadCapacity thr5 = new ThreadCapacity();

        thr1.setPriority(MIN_PRIORITY);
        thr1.start();

        thr2.setPriority(MIN_PRIORITY);
        thr2.start();

        thr3.setPriority(MAX_PRIORITY);

        try {
            thr3.join();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        thr3.start();

        thr4.setPriority(MAX_PRIORITY);
        try {

                Thread.sleep(400);
            }
             catch (Exception e)
            {
                System.out.println(e);
            }

        thr4.start();

        thr5.setPriority(MIN_PRIORITY);
        thr5.start();


    }



}
