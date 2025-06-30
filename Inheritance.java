
class Vehicle {
    String brand;

   
    Vehicle(String brand) {
        this.brand = brand;
    }

    
    void start() {
        System.out.println(brand + " vehicle is starting...");
    }
}


class Car extends Vehicle {
    String model;

    
    Car(String brand, String model) {
        super(brand);
        this.model = model;
    }

    
    @Override
    void start() {
        super.start(); // call the superclass method
        System.out.println(brand + " " + model + " car is ready to drive!");
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Car myCar = new Car("BYD", "Autto3");
        myCar.start(); // Calls overridden method
    }
}
