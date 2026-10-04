import java.util.Scanner;

public class Replacement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] current = new int[n];

        for (int i = 0; i < n; i++) {
            current[i] = sc.nextInt();

            if (current[i] > 0) {
                current[i] = 1;
            } else if (current[i] < 0) {
                current[i] = 2;
            } else {
                current[i] = 0;
            }
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(current[i] + " ");
        }
    }
}