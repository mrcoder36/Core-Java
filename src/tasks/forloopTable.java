package tasks;

import java.util.Scanner;

public class forloopTable {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter the Number for table: ");

        int table = data.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(table + " * " + i + " = " + table * i);
        }
        data.close();
    }
}
