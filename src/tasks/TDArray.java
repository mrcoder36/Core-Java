package tasks;

import java.util.Scanner;

public class TDArray {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int row = 2;
        
        int col = 2;
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
