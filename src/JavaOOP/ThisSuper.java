package JavaOOP;



class A extends Object{
    public A(){
        super();
        System.out.println("A");
    }

    public A(int a){
        super();
        System.out.println("A with int");
    }

    public void print(){
        System.out.println("A");
    }
}

class B extends A{
    public B(){
        super(3);
        System.out.println("B");
    }

    public B(int x){
        this();
//        super(x);
        System.out.println("B "+x);
    }

    public void print(){
        System.out.println("B print");
    }
}

public class ThisSuper {
    public static void main(String[] args) {
        B b = new B(10);

        b.print();

//        B b1 = new B();
    }
}
