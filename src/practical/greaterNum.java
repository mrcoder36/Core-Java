package practical;

import java.util.Scanner;

public class greaterNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter four numbers:");
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();

        System.out.print("Enter number 3: ");
        int num3 = sc.nextInt();

        System.out.print("Enter number 4: ");
        int num4 = sc.nextInt();

        // Find the greatest number
        int greatest = num1;

        if (num2 > greatest) {
            greatest = num2;
        }
        if (num3 > greatest) {
            greatest = num3;
        }
        if (num4 > greatest) {
            greatest = num4;
        }

        System.out.println("\nThe greatest number is: " + greatest);

        sc.close();
    }
}
