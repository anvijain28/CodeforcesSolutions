import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            String s = sc.next();

            int dots = 0;
            int count = 0;
            boolean found = false;

            for (int i = 0; i < n; i++) {

                if (s.charAt(i) == '.') {
                    dots++;
                    count++;

                    if (count >= 3) {
                        found = true;
                    }

                } else {
                    count = 0;
                }
            }

            if (found)
                System.out.println(2);
            else
                System.out.println(dots);
        }

        sc.close();
    }
}