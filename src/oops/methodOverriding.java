package oops;

class company {
    void display() {
        System.out.println("this is Fortune cloud...");

    }

}

class employee extends company {
    void display(){
        super.display();
        System.out.println("Name: Vishal");
    }

}
public class methodOverriding {
    public static void main(String[] args) {
        employee obj = new employee();
        obj.display();

    }
    
}
