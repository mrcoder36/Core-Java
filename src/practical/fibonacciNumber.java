package practical;

public class fibonacciNumber {
    public static void main(String[] args) {
        fibonacciNumber obj = new fibonacciNumber();
        obj.fib();
    }

    void fib() {
        var num1 = 0;
        int num2 = 1;
        int num3;
        for (int i = 1; i < 15; i++) {
            num3 = num1 + num2;
            System.out.println(num3);
            
            num1 = num2;
            num2 = num3;
        }
    }

}
