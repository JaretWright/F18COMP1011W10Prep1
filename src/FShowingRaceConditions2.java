public class FShowingRaceConditions2 {
    static int counter = 1;
    public static void main(String[] args)
    {
        Runnable r = () -> System.out.printf("counter value: %d%n",

                getCounterValue());

        Thread one = new Thread(r, "one");
        one.start();

        Thread two = new Thread(r, "two");
        two.start();
    }

    public static int getCounterValue()
    {
        return counter++;
    }
}
