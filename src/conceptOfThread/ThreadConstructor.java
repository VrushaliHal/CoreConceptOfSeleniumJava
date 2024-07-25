package conceptOfThread;

public class ThreadConstructor {
    public static void main(String[] args) {
        MyThreadConstructor mtr = new MyThreadConstructor("Vrushali");
        System.out.println(mtr.getName());
        System.out.println(mtr.getId());
        System.out.println(mtr.getThreadGroup());
        System.out.println(mtr.getState());
        mtr.start();
        System.out.println(mtr.getState());
        System.out.println(mtr.getState());
        System.out.println(mtr.getState());

    }
}
