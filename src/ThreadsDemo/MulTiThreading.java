package ThreadsDemo;

class A extends Thread
{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("hello");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("hi");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}


public class MulTiThreading {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.start();
        b.start();
    }
}
