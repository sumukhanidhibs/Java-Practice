package JavaOOP.AbstracDemo.AbstractAnonymous;

abstract class A{
    public abstract void show();
}


public class AbstractAnonymousDemo {
    public static void main(String[] args) {
        A a = new A(){
            public void show(){
                System.out.println("Hello World Anonymous");
            }
        };
        a.show();
        System.out.println(a);
    }

}