import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            // If all elements are equal, impossible
            if (a[0] == a[n - 1]) {
                System.out.println("NO");
                continue;
            }

            // Otherwise, put the largest element first
            System.out.println("YES");

            System.out.print(a[n - 1] + " ");

            for (int i = 0; i < n - 1; i++) {
                System.out.print(a[i] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}