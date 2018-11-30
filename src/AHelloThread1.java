public class AHelloThread1 extends Thread{
    public void run(){
        System.out.println("Hello from "+Thread.currentThread().getName()
        + " created by extending Thread class!");
    }
}
