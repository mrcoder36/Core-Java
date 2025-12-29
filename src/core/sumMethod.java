package core;

import java.util.Scanner;

public class sumMethod {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int n = data.nextInt();
        System.out.print("Enter the 2nd number: ");
        int m = data.nextInt();
        

        System.out.println("choose: + , - , * , /");
        String choice = data.next();
        data.close();
        switch (choice) {
            case "+":
                System.out.println("The addition is " + add(n, m));
                break;
            case "-":
                System.out.println("The subtraction is " + sub(n, m));
                break;
            case "*":
                System.out.println("The multiplication is " + multi(n, m));
                break;
            case "/":
                System.out.println("The division is " + div(n, m));
                break;
            default:
                System.out.println("Invalid Input..");
                break;

        }
        
    }
    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int multi(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) {
        return a / b;
    }

    int sample(int a) {
        return a; 
    }
}
