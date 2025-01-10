package JavaBasic;

class Calculators
{
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public void add(){
        System.out.println("Addition");
    }
}


public class MethodOverloading {

    public static void main(String[] args) {
        Calculators obj = new Calculators();
        System.out.println(obj.add(1,2));
        System.out.println(obj.add(1,2,3));
        obj.add();
    }
}
