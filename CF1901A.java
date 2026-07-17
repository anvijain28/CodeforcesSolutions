import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int maxDistance = a[0]; // Distance from 0 to first gas station

            // Maximum distance between consecutive gas stations
            for (int i = 1; i < n; i++) {
                maxDistance = Math.max(maxDistance, a[i] - a[i - 1]);
            }

            // Distance from last gas station to x and back
            maxDistance = Math.max(maxDistance, 2 * (x - a[n - 1]));

            System.out.println(maxDistance);
        }

        sc.close();
    }
}