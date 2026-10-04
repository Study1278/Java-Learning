import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long sum = 0;

        for (int i = 0; i < n; i++) {
            int current = sc.nextInt();
            sum = sum + current;
        }

        System.out.print(Math.abs(sum));
    }
}