package oops;

class company {
    void display(int a) {
        System.out.println("this is Fortune cloud...");
    }
}

class parent {
    void p() {
        System.out.println("THis is parent class..");
    }
}

class child1 extends parent{
    void c1() {
        System.out.println("THis is child1 class..");
    }
}

class child2 extends parent{
    void c2() {
        System.out.println("THis is child2 class..");
    }
}

class subchild extends child2{
    void sc() {
        System.out.println("THis is subchild class..");
    }
}

public class hybridInherit {
    public static void main(String[] args) {
        subchild obj = new subchild();
        obj.p();
        obj.c2();
        obj.sc();
        child1 obj2 = new child1();
        obj2.c1();
        
        // Accessing company display method
        company comp = new company();
        comp.display(1);
    }
}
