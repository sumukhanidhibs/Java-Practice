package ThreadsDemo;

class D1 implements Runnable
{
    public void run(){
        for(int i=0;i<8;i++){
            System.out.println("hello");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

class D2 implements Runnable{
    public void run(){
        for(int i=0;i<8;i++){
            System.out.println("hi");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}


public class RnnableInterfaceDemo {
    public static void main(String[] args) {
        Runnable a = new D1();
        Runnable b = new D2();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();
    }
}

