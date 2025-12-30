package oops;

class parent {
    void demo() {
        System.out.println("This is parent class");
    }
}

class child extends parent {
    void show() {
        System.out.println("This is child class");
    }
}

public class singleInherit {
    public static void main(String[] args) {
        child obj = new child();
	obj.demo();
	obj.show();
    }
}
