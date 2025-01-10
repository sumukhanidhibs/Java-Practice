package JavaOOP.InheritanceDemo;

public class LamdaExpression {
    public static void main(String[] args) {
        A a = () -> System.out.println("Hello World");
        a.show();
    }
}
