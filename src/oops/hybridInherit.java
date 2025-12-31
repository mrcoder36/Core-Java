package oops;
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
        
    }
}
