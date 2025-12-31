package oops;

class automobile {
    void display() {
        System.out.println("Automobile");
    }
}

class car1 extends automobile {
    void display() {
        super.display();
        System.out.println("Car");
    }
}

class electricCar extends car1 {
    void display() {
        super.display();
        System.out.println("Electric Car");
    }
}

class Mahindra extends electricCar {
    void display() {
        super.display();
        System.out.println("Mahindra SUV 700");
    }
}

public class superMultiLevel {
    public static void main(String[] args) {
        Mahindra obj = new Mahindra();
        obj.display();
    }
    
}
