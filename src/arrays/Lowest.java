import java.util.Scanner;

public class Lowest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int min = sc.nextInt();
        int index = 1;

        for (int i = 2; i <= n; i++) {
            int current = sc.nextInt();

            if (current < min) {
                min = current;
                index = i;
            }
        }

        System.out.println(min + " " + index);
    }
}