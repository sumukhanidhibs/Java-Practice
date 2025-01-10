package JavaOOP.InheritanceDemo;

interface Computer{
    void code();
}

class Laptop implements Computer{
    @Override
    public void code() {
        System.out.println("Laptop");
    }
}

class Desktop implements Computer{
    @Override
    public void code() {
        System.out.println("Desktop");
    }

}


public class InheritanceCompany {
    public static void main(String[] args) {
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();
        laptop.code();
        desktop.code();
    }
}
