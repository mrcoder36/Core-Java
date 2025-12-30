package oops;

class Vehicle { // parent
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is riding");
    }
}

class Truck extends Vehicle {
    void load() {
        System.out.println("Truck is loading goods");
    }
}

public class hierarchical { //main
    public static void main(String[] args) {

        Car car = new Car();
        car.start();
        car.drive();

        Bike bike = new Bike();
        bike.start();
        bike.ride();

        Truck truck = new Truck();
        truck.start();
        truck.load();
    }
    
}
