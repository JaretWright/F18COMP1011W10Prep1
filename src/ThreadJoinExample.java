public class ThreadJoinExample {
    public static void main(String[] args)
    {
        TestJoinClass t1 = new TestJoinClass("t1");
        TestJoinClass t2 = new TestJoinClass("t2");
        TestJoinClass t3 = new TestJoinClass("t3");
        TestJoinClass t4 = new TestJoinClass("t4");

//        t1.start();
////        t2.start();
////        t3.start();
//
//        //the join() method will make the current thread wait until
//        //the thread finishes execution
//        try{
//            t1.join();
//        }catch(Exception e)
//        {
//            System.out.println(e);
//        }
//        t2.start();
//
//        //thread t3 will not start until t2 finishes
//        t3.start();

        //alternative pathway with t1 and t2 both started, then t2 uses join
        t1.start();
        t2.start();
        t3.start();
        try{
            t2.join();
        }catch(Exception e)
        {
            System.out.println(e);
        }


        //thread t3 will not start until t2 finishes
        t4.start();
    }
}
