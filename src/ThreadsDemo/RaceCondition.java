package ThreadsDemo;

class C{

    int i;

    public void increment(){
        i++;
    }
}


public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        C c = new C();

        Runnable r1 = ()->{
            for(int i = 0;i < 10000;i++){
                c.increment();
            }
        };

        Runnable r2 = ()->{
            for(int i = 0;i < 10000;i++){
                c.increment();
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.i);

    }

}
