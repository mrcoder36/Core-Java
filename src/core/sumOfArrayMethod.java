package core;

public class sumOfArrayMethod {
    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 6};
        System.out.println("The sum of array is " + sumArray(arr));
        sumArray(arr);
    }

    static int sumArray(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        // System.out.println("The sum of array is " + sum);
        return sum;
    }
}
