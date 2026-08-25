import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];
            int totalTwos = 0;

            // Read array and count total number of 2s
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();

                if (a[i] == 2) {
                    totalTwos++;
                }
            }

            // Odd number of 2s cannot be divided equally
            if (totalTwos % 2 == 1) {
                System.out.println(-1);
                continue;
            }

            int needed = totalTwos / 2;
            int count = 0;
            int answer = -1;

            // Find the smallest k
            for (int i = 0; i < n - 1; i++) {

                if (a[i] == 2) {
                    count++;
                }

                if (count == needed) {
                    answer = i + 1;
                    break;
                }
            }

            System.out.println(answer);
        }

        sc.close();
    }
}