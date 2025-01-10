package JavaOOP;

class Mobile{

    String brand;
    int price;
    static String type = "Mobile";

    public Mobile(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public void display() {
        System.out.println(brand + " " + price + " " + type);
    }

    public static void display1(Mobile obj){
        System.out.println(obj.brand + " " + obj.price + " " + type);
    }


}


public class StaticMethoDemo {

    public static void main(String[] args) {
        Mobile m1 = new Mobile("Apple", 3000);
        m1.display();

        Mobile s1 = new Mobile("Samsung", 2500);

        Mobile.display1(s1);
    }
}
