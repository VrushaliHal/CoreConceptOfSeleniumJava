package conceptOfThread;

public class IntConstructor {
    public static void main(String[] args) {
        InterFaceConstructor itr = new InterFaceConstructor("Vrushali", null);
        Thread te= new Thread(itr);
        te.start();
        System.out.println(te.getName());
        System.out.println(te.getState());
    }
}
