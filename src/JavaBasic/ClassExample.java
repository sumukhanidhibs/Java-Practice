package JavaBasic;

class Calculator{
    int a,b;

    Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int add(){
         return a+b;
    }

    public int sub(){
        return a-b;
    }

    public int mul(){
        return a*b;
    }

    public int div(){
        return a/b;
    }

}


public class ClassExample {
    public static void main(String[] args) {
        Calculator c = new Calculator(5,6);
        System.out.println(c.add());
        System.out.println(c.sub());
        System.out.println(c.mul());
        System.out.println(c.div());
    }

}
