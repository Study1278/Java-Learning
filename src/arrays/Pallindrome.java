import java.util.Scanner;

public class Pallindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0, j = n - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}