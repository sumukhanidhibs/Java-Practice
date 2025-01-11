package ThreadsDemo;

class D{

    int i;

    public synchronized void increment(){
        i++;
    }
}

public class SynchronizedThread {

    public static void main(String[] args) throws InterruptedException {
        D d = new D();

        Runnable r1 = ()->{
            for(int i = 0;i < 10000;i++){
                d.increment();
            }
        };

        Runnable r2 = ()->{
            for(int i = 0;i < 10000;i++){
                d.increment();
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(d.i);
    }
}

