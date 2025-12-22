package tasks;

import java.util.Scanner;

public class multiDArray {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter the size of row: ");
        int row = data.nextInt();
        System.out.print("Enter the size of column: ");
        int col = data.nextInt();
        System.out.print("Enter the array: ");
        int arr[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = data.nextInt();
                
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");  
            }
            System.out.println();
        }

    }
}
