import java.util.Scanner;
// FIBONACCI.
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms you want to print fibonicci series: ");
        int n = sc.nextInt();

        int first = 0, second = 1;
        System.out.print("Fibonacci Series upto " + n + " terms : ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

        sc.close();
    }
}
