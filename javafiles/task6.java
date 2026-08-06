import java.util.Scanner;

 class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print all possible pairs
        System.out.println("All possible pairs:");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
            }
        }

        sc.close();
    }
}
