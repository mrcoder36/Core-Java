package oops;

public class encapsulation {
    //  data member should be private
    // use setter method for storing the data
    // use getter method for access the data 
    private int emp_id;
    private int emp_salary;

    public void setemp_details(int emp_id, int emp_salary) {
        this.emp_id = emp_id;
        this.emp_salary = emp_salary;
    }

    public int getemp_id() {
        return emp_id;
    }
    
    public int getemp_salary() {
        this.getemp_id();
        return emp_salary;
    }
    
    public static void main(String[] args) {
        encapsulation obj = new encapsulation();
        obj.setemp_details(101,250000);
        System.out.println("Employee ID: " + obj.getemp_id());
        System.out.println("Employee Salary: " + obj.getemp_salary());
    }

}
