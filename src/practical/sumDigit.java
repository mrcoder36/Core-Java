package practical;

import java.util.Scanner;

public class sumDigit {
    public static void main(String[] args) {
        
        System.out.println("Enter the number: ");
        Scanner data = new Scanner(System.in);
        int num = data.nextInt();
        data.close();
        int sum = 0;

        do {
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        } while (num > 0);
        System.out.println("sum of digit is : " + sum);
    }
}
