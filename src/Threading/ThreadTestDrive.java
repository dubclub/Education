package Threading;

public class ThreadTestDrive {

    public static void main(String[] args) {
        Runnable theJob = new MyRunnable();
        Thread t = new Thread(theJob);
        t.start() ;
        System.out.println("Возвращаемся в метод main!");

    }

}
