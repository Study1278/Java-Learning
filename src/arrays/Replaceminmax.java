import java.util.Scanner;

public class Replaceminmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        int maxIndex = 0;
        int minIndex = 0;
        int min = arr[0];
        int max = arr[0];


        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }

            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
        }
        int temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}