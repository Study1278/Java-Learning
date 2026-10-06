import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next(String.valueOf(n));

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += str.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}