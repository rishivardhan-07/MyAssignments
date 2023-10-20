package week1.day2;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; 

        long firstValue = 0, secondValue = 1;

        System.out.println("Fibonacci Series");
        for (int i = 1; i <= n; i++) {
            System.out.print(firstValue + " ");

            long nextValue = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = nextValue;
        }
    }
}