package oops;

public class methodOverloading {
    void payment() {
        System.out.println("Debit");
    }

    void payment(int a) {
        System.out.println("Credit");
    }

    void payment(String n, int b) {
        System.out.println("UPI");
    }

    void payment(int c, String na) {
        System.out.println("wallet");
    }

    void payment(char ch) {
        System.out.println("Cash on delivery");
    }

    public static void main(String[] args) {
        methodOverloading obj = new methodOverloading();
        obj.payment();
        obj.payment(2);
        obj.payment("a" ,3);
        obj.payment(3, "na");
        obj.payment('c');
    }
}
// 