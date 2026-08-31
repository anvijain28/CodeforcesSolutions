import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int digits = 0;
            int temp = n;

            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            int firstDigit = n;

            while (firstDigit >= 10) {
                firstDigit /= 10;
            }

            int answer = 9 * (digits - 1) + firstDigit;

            System.out.println(answer);
        }

        sc.close();
    }
}