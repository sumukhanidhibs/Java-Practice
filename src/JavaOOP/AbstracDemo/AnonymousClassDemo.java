package JavaOOP.AbstracDemo;

class A{
    public void show(){
        System.out.println("Hello World");
    }
}


public class AnonymousClassDemo {
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
