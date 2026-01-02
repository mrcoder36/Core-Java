package oops;

public class thisKeywords {
    String name;
    long ph_no;
    void show(String name, long ph_no) {
        this.name = name;
        this.ph_no = ph_no;
        System.out.println("Name:" + name);
        System.out.println("Phone No.:" + ph_no);
    }
    public static void main(String[] args) {
        thisKeywords obj = new thisKeywords();
        
        obj.show("Vishal", 9096074635l);
        System.out.println(obj.name);
        System.out.println(obj.ph_no);
    }
}
