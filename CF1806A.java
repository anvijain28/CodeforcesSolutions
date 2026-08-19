import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();

            // y cannot decrease
            if (d < b) {
                System.out.println(-1);
                continue;
            }

            // Number of diagonal moves needed
            long up = d - b;

            // x after all diagonal moves
            long x = a + up;

            // We cannot increase x beyond this value
            if (x < c) {
                System.out.println(-1);
                continue;
            }

            // Remaining moves are left moves
            long left = x - c;

            long answer = up + left;

            System.out.println(answer);
        }

        sc.close();
    }
}