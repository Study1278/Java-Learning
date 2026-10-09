import java.util.Arrays;
import java.util.Scanner;
public class Sort {
    public static void input(int[] arr, int n){
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
    }
    public static void SelectionSort(int[] arr, int n ){
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("SelectionSort :- " + Arrays.toString(arr));
    }
    static void BubbleSort(int[] arr , int n){
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println("BuubleSort :- " + Arrays.toString(arr));
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The No. of Element :- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        input(arr,n);
        BubbleSort(arr,n);
        SelectionSort(arr,n);
        System.out.println("Default : - " +Arrays.toString(arr));
    }
}