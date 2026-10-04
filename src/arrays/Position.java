import java.util.Scanner;

public class Position {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int current = sc.nextInt();

            if (current <= 10) {
                System.out.println("A[" + i + "] = " + current);
            }
        }
    }
}