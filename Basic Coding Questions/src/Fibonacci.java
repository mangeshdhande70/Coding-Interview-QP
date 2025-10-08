public class Fibonacci {

    public static void main(String[] args) {

        int fib_count = 10;

        for (int i = 0; i < fib_count ; i++) {
            System.out.print(getFibonacciUsingRecursion(i) + " ");
        }


    }

    static int getFibonacciUsingRecursion(int n){
        if(n <= 1) return n;
        return getFibonacciUsingRecursion(n - 1) + getFibonacciUsingRecursion(n -2);
    }

}
