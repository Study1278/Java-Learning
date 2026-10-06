import java.util.Scanner;
public class SmallestPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        while(T-- >0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int SmallPair = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int Pair = arr[i] + arr[j] + j - i;
                    if (SmallPair > Pair) {
                        SmallPair = Pair;
                    }
                }
            }
            System.out.println(SmallPair);
        }
    }
}