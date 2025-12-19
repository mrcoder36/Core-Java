package tasks;

import java.util.Scanner;

public class whileTask {
    public static void main(String args[]) {
		Scanner data = new Scanner(System.in);
		System.out.print("Enter your name: ");		
		String name = data.next();
		System.out.print("Enter the count: ");
		int numb = data.nextInt();
        int count = 0;
		
		while(count <= numb) {
			System.out.println(count + "." + name);
			count++;
		}
        data.close();
	}
}
