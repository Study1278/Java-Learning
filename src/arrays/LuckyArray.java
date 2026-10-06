import java.util.Scanner;
public class LuckyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int Min=arr[0];
        for (int i = 1; i <n ; i++) {
            if(Min > arr[i]){
                Min=arr[i];
            }
        }int count=0;
        for (int i = 0; i <n ; i++) {
            if(Min==arr[i]){
                count++;
            }
        }
        if (count%2==0){
            System.out.println("Unlucky");
        }else{
            System.out.println("Lucky");
        }
    }
}