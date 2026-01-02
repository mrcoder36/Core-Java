package oops;

class a {
    protected void show() {
        System.out.println("Happy");

    }
}

class b extends a {
    protected void show() {
        super.show();
        System.out.println("New Year....");
    }
}

public class access {
    public static void main(String[] args) {
        b obj = new b();
        obj.show();
    }
}
