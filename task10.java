import java.util.Scanner;
import java.util.function.BiFunction;

 class Task10 {

    public static Integer sumLastDigits(Integer a, Integer b) {
        return (a % 10) + (b % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        BiFunction<Integer, Integer, Integer> sum = Task10::sumLastDigits;

        System.out.println("Sum of last digits = " + sum.apply(a, b));
    }
}