package JavaOOP.AbstracDemo;

abstract class Car{
    abstract void drive();
    abstract void fourWheelDrive();
    public void playMusic(){
        System.out.println("Play music");
    }
}


abstract class Ritz extends Car{
    @Override
    void drive() {
        System.out.println("Ritz drive");
    }
}

class Jeep extends Car{
    @Override
    void drive() {
        System.out.println("Jeep drive");
    }

    @Override
    void fourWheelDrive(){
        System.out.println("FourWheel drive");
    }
}


public class AbstractClass extends Ritz {
    public static void main(String[] args) {
        Jeep j = new Jeep();
        j.drive();
        j.fourWheelDrive();
        AbstractClass ac = new AbstractClass();
        ac.drive();
    }

    @Override
    void fourWheelDrive() {

    }
}
