package JavaOOP;

class Human
{
    String name;
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



public class EncapsulationDemo {
    public static void main(String[] args) {
        Human h = new Human();
        h.setName("John");
        System.out.println(h.getName());

        h.setAge(23);
        System.out.println(h.getAge());

    }
}
