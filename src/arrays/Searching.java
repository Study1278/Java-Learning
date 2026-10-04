import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int found = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == found) {
                System.out.println(i);
                return;
            }
        }

        System.out.println("-1");
    }
}