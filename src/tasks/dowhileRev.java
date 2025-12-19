package tasks;

import java.util.Scanner;

public class dowhileRev {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int num = data.nextInt();
        System.out.print("Enter the stop number: ");
        int stop = data.nextInt();
        do {
            System.out.println(num);
            num--;
        } while (num >= stop);
        data.close();
    }
}
