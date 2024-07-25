package conceptOfThread;

public class InterFaceConstructor implements Runnable{

     String name ;
    public InterFaceConstructor( String name, Runnable target)
    {
       // super();
    }
    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        int i=0;
        while(i<3)
        {
            System.out.println("I am a Thread");
            i++;
        }
    }
}
