package conceptOfThread;

public class MainThread{
        public static void main(String[] args) {
            MyThread1 tr1 = new MyThread1();
            MyThread2 tr2 = new MyThread2();
            tr1.start();
            tr2.start();
        }
    }
