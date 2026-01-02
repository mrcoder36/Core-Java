package oops;

public class admin {
    private String ad_id;
    private String ad_pass;

    public void set_admin(String ad_id, String ad_pass) {
        this.ad_id = ad_id;
        this.ad_pass = ad_pass;
    }

    admin() {          // constructor 
        System.out.println("Hello world!!!!");
    }

    public String getAdminId() {
        return ad_id;
    }

    public String getAdminPass() {
        return ad_pass;
    }

    public static void main(String[] args) {
        admin obj = new admin();
        obj.set_admin("vishal@gmail.com", "vishal123");
        System.out.println("Admin ID: " + obj.getAdminId());
        System.out.println("Admin Password: " + obj.getAdminPass());
    }
}
