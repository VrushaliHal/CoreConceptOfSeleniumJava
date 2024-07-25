package conceptOfThread;

public class MyThreadConstructor extends Thread{
    public MyThreadConstructor(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<3)
        {
            System.out.println("I am a Thread");
            i++;
        }
    }
}
