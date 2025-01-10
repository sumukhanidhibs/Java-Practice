package JavaOOP.InheritanceDemo;

@FunctionalInterface
interface A{
    void show();
}

//class B implements A{
//    @Override
//    public void show() {
//        System.out.println("B");
//    }
//}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        A a = new A()
        {
            @Override
            public void show() {
                System.out.println("hello");
            }
        };

        a.show();
    }
}
