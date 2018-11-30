public class EShowingRaceConditions {
    static double a = 10;
    static double b;

    public static void main(String[] args)
    {
        Runnable r1 = () ->
        {
            if (a == 10)
                try{
                    Thread.sleep(0); //play with the value in here
                    b = a/2.0;
                    System.out.println(Thread.currentThread().getName() +": "+b);
                }catch (InterruptedException e)
                {
                    System.out.println(e);
                }
        };

        Runnable r2 = () -> {a=12;};

        Thread threadA = new Thread(r1, "Thread A");
        Thread threadB = new Thread(r2, "Thread B");
        threadA.start();
        threadB.start();
    }
}
