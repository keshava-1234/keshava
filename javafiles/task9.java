import java.util.Scanner;
import java.util.function.Predicate;

 class Task9 {

    public static boolean isPalindrome(Integer num) {
        int original = num;
        int reverse = 0;

        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        Predicate<Integer> palindrome = Task9::isPalindrome;

        if (palindrome.test(num))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
