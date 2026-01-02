package practical;

import java.util.Scanner;

public class evenNumber {
    public static void main(String[] args) {
        evenNumber obj = new evenNumber();
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the Starting number: ");
        int start = data.nextInt();
        System.out.println("Enter the ending number: ");
        int end = data.nextInt();
        System.out.println("Enter the choice even/odd: ");
        String choice = data.next();
        obj.even(start, end, choice);
        data.close();
    }

    void even(int start, int end, String choice) {
        for (int i = start; i < end; i++) {
            if (choice.equals("even")) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            } else if (choice.equals("odd")) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            } else {
                System.out.println("Invalid input..");
            }
        }
    }

}
