public class BHelloRunnable2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from "+Thread.currentThread().getName()+
                " a thread created by implementing a runnable interface");
    }
}
