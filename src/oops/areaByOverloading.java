package oops;

public class areaByOverloading {
    void area(int a) {
        System.out.println("Area of Square: " + a*a);
    }

    void area(int l, int b) {
        System.out.println("Area of Rectangle: " + l * b);
    }

    void area(float r) {
        System.out.println("Area of Circle: " + 3.14 * (r*r));
    }

    void area(float ba, int h) {
        System.out.println("Area of Triangle: " + 0.5 * (ba*h));
    }

    public static void main(String[] args) {
        areaByOverloading obj = new areaByOverloading();
        obj.area(4);
        obj.area(6, 4);
        obj.area(5.0f);
        obj.area(6.0f,8);
    }
}
