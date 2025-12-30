package core;

public class animal { 
    String name;
    String type;
    String sound;

    void eat() {
        System.out.println("Eating...");
    }

    void sleep() {
        System.out.println("Sleeping...");
    }

    public static void main(String[] args) {

        animal ani1 = new animal();
        ani1.name = "Horse";
        ani1.type = "Domestic";
        ani1.sound = "keeee";
        System.out.println("Animal name: " + ani1.name);
        System.out.println("Animal type: " + ani1.type);
        System.out.println("Animal sound: " + ani1.sound);
        ani1.eat();
        ani1.sleep();

        System.out.println("----------------------------------------------");

        animal ani2 = new animal();
        ani2.name = "Lion";
        ani2.type = "Wild";
        ani2.sound = "Roar";
        System.out.println("Animal name: " + ani2.name);
        System.out.println("Animal type: " + ani2.type);
        System.out.println("Animal sound: " + ani2.sound);
        ani2.eat();
        ani2.sleep();

    }
}
