public class CThreadExample {
    public static void main(String[] args) {
        //create a Thread using a class that implements Runnable
        new Thread(new BHelloRunnable2()).start();

        //create a Thread using a class that extends Thread
        (new AHelloThread1()).start();

        //create a Runnable object
        Runnable r1 = new Runnable() {

            @Override
            public void run() {
                System.out.println("Hello from " + Thread.currentThread().getName()
                        + " not using lambda");
            }
        };

        Runnable r2 = () -> System.out.println("Hello from " +
                Thread.currentThread().getName() + " using a lambda");

        Thread t1 = new Thread(r1, "JDub thread");
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

    }

}
