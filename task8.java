import java.util.Scanner;
import java.util.function.Function;

class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        Function<Integer, Integer> fibonacci = num -> {
            if (num == 0)
                return 0;
            if (num == 1)
                return 1;

            int a = 0, b = 1, c = 0;

            for (int i = 2; i <= num; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        };

        System.out.println("Fibonacci = " + fibonacci.apply(n));
    }
}