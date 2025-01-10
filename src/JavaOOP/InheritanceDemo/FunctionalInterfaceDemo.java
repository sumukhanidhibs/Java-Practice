package JavaOOP.InheritanceDemo;

@FunctionalInterface
interface A{
    void show();
}

interface B {
    int show(int a, int b);
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
