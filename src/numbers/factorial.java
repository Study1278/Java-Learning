import java.util.Scanner;
class factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the No. ");
        int n=sc.nextInt();
        int i=1;
        while(n>=1){
            i =n*i;
            n--;
        }
        System.out.println(i);
    }
}
