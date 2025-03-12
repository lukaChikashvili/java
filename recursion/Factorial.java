package recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(sum(1225));
    }


    static int factorial(int n) {
       if(n <= 1) return 1;

      return n * factorial(n - 1);
    }

// sum of digits
    static int sum(int n) {
       
        if(n == 0) return 0;

        return (n%10) + sum(n / 10);
        
    }
}
