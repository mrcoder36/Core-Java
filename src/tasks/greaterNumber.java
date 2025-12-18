package tasks;

import java.util.Scanner;

public class greaterNumber {
    public static void main(String[] args) {
        int num1, num2;
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        num1 = data.nextInt();
        System.out.println("Enter the 2nd number: ");
        num2 = data.nextInt();

        if (num1 > num2) {
            System.out.println("The number " + num1 + " is greater than " + num2);
        } else if (num1 < num2) {
            System.out.println("The number " + num1 + " is less than " + num2);
        } else {
            System.out.println("The number is equal...");
        }
        data.close();
    }
}
