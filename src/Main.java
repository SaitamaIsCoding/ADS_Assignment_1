import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Task 1 (n=4): " + sumOfSquares(4));


        int[] arr = {5, 10, 15, 20, 25};
        System.out.println("Task 2 (n=3): " + sumOfArray(arr, 3));


        System.out.println("Task 3 (b=4, n=3): " + sumOfPowers(4, 3));


        System.out.println("Task 4: Enter the number N, then N numbers separated by spaces:");
        int n = sc.nextInt();
        System.out.print("Output: ");
        reverseSequence(n, sc);
        System.out.println();

        sc.close();
    }

    /*
     * Task 1: Sum of squares of first n positive integers.
     * Complexity (Big-O): O(n)
     * Explanation: The function calls itself recursively n times (from n down to 1).
     * In each call, it performs a constant time O(1) operation (multiplication and addition).
     * Therefore, the total time complexity is strictly linear, O(n).
     */
    public static int sumOfSquares(int n) {
        if (n == 1) {
            return 1;
        }
        return (n * n) + sumOfSquares(n - 1);
    }

    /*
     * Task 2: Sum of the first n elements of an array.
     * Complexity (Big-O): O(n)
     * Explanation: The recursion depth is equal to n. In each step, we access an array
     * element by index and add it to the result of the next recursive call, which takes O(1) time.
     * Overall time complexity is O(n).
     */
    public static int sumOfArray(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }
        return arr[n - 1] + sumOfArray(arr, n - 1);
    }

    /*
     * Task 3: Sum of the first n powers of a base b.
     * Complexity (Big-O): O(n)
     * Explanation: The function makes n recursive calls (from n down to 0).
     * Assuming Math.pow takes constant time O(1) for relatively small integers,
     * the dominant factor is the n recursive steps. Thus, complexity is O(n).
     */
    public static int sumOfPowers(int b, int n) {
        if (n == 0) {
            return 1;
        }
        return (int) Math.pow(b, n) + sumOfPowers(b, n - 1);
    }

    /*
     * Task 4: Display sequence in reverse order.
     * Constraints: No arrays, no cycles.
     * Complexity (Big-O): O(N)
     * Explanation: The function uses the call stack to store the input values.
     * It makes N recursive calls, waiting for the next input at each step.
     * After N calls, the stack unwinds, printing the values in reverse order. O(N) time and O(N) space.
     */
    public static void reverseSequence(int n, Scanner sc) {
        if (n == 0) {
            return;
        }
        int num = sc.nextInt();
        reverseSequence(n - 1, sc);
        System.out.print(num + " ");
    }
}