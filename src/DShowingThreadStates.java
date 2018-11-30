public class DShowingThreadStates {
    public static void main(String[] args) throws InterruptedException {
        System.out.printf("%s is %s alive and in %s state with priority %d %n",
                Thread.currentThread().getName(),
                Thread.currentThread().isAlive() ?"":"not ",
                Thread.currentThread().getState(),
                Thread.currentThread().getPriority());

        //create a Runnable object that prints information about the Thread
        Runnable r1 = () -> {
            Thread thd = Thread.currentThread();
            System.out.printf("%s is %salive and in %s state with priority %d %n",
                    Thread.currentThread().getName(),
                    Thread.currentThread().isAlive() ?"":"not ",
                    Thread.currentThread().getState(),
                    Thread.currentThread().getPriority());
        };

        //Create a thread and display it's state before starting it
        Thread t1 = new Thread(r1, "Thread t1");
        System.out.printf("%s is %s alive and in %s state with priority %d %n",
                t1.getName(),
                t1.isAlive() ?"":"not ",
                t1.getState(),
                t1.getPriority());
        //this calls the run method that will have the thread display it's state
        t1.start();

        //create another thread that will use our runnable to display the
        //state of the thread
        Thread t2 = new Thread(r1);
        t2.start();

        //put the main thread to sleep for 2000 milliseconds (2 sec)
        System.out.println("~~~~~~~~~ waiting 2 seconds ~~~~~~~~~");
        Thread.sleep(2000);
        System.out.println("~~~~~~~~~ finished waiting ~~~~~~~~~");

        //change the name of thread 2 and print out its info
        t2.setName("Thread t2");
        System.out.printf("%s is %s alive and in %s state with priority %d %n",
                t2.getName(),
                t2.isAlive() ?"":"not ",
                t2.getState(),
                t2.getPriority());


        //print out info about the current thread
        System.out.printf("%s is %s alive and in %s state with priority %d %n",
                Thread.currentThread().getName(),
                Thread.currentThread().isAlive() ?"":"not ",
                Thread.currentThread().getState(),
                Thread.currentThread().getPriority());

    }
}
