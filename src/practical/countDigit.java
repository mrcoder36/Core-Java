package practical;

import java.util.Scanner;

public class countDigit {
    public static void main(String[] args) {
        
        System.out.println("Enter the number: ");
        Scanner data = new Scanner(System.in);
        int num = data.nextInt();
        data.close();
        int count = 0;
        while (num > 0) {
            count++;
            num = num/10;
        }
        System.out.println("count of digit is : " + count);
    }
}
