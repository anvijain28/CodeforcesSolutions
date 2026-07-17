import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                b[i] = a[i]; // Copy the array
            }

            if (k == 1) {
                Arrays.sort(b);

                boolean sorted = true;

                for (int i = 0; i < n; i++) {
                    if (a[i] != b[i]) {
                        sorted = false;
                        break;
                    }
                }

                if (sorted)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

        sc.close();
    }
}