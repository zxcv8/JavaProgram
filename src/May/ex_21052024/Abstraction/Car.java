package May.ex_21052024.Abstraction;

abstract class Car {
    Car() {
    }

    void gearbox(){
        System.out.println("GearBox is working");
    }

    abstract void drive();
}