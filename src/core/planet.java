package core;


public class planet {
    String name;
    int place;
    int moon;
    void revolve() {
        System.out.println("Revolving...");
    }

    void rotate() {
        System.out.println("Rotating...");
    }
    public static void main(String[] args) {
        
        planet pl1 = new planet();
        pl1.name = "Earth";
        pl1.place = 3;
        pl1.moon = 1;
        System.out.println("Planet name: " + pl1.name);
        System.out.println("Planet distance from Sun: " + pl1.place);
        System.out.println("Planet number of moon: " + pl1.moon);
        pl1.revolve();
        pl1.rotate();

        System.out.println("----------------------------------------------");

        planet pl2 = new planet();
        pl2.name = "Mars";
        pl2.place = 4;
        pl2.moon = 2;
        System.out.println("Planet name: " + pl2.name);
        System.out.println("Planet distance from Sun: " + pl2.place);
        System.out.println("Planet number of moon: " + pl2.moon);
        pl2.revolve();
        pl2.rotate();
        
    }

}
