package oops;

class Country {
    void countryName() {
        System.out.println("Country: India");
    }
}

class State extends Country {
    void stateName() {
        System.out.println("State: Maharashtra");
    }
}

class City extends State {
    void cityName() {
        System.out.println("City: Pune");
    }
}

public class multiCity {
    public static void main(String[] args) {

        City obj = new City();
        obj.countryName();
        obj.stateName(); 
        obj.cityName(); 
    }
}
