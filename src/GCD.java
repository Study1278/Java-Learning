import java.util.Scanner;
class GCD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No. A and B");
        int a = sc.nextInt();
        int b= sc.nextInt();
        int ans=1;
        int min=Math.min(a,b);
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i == 0){
                ans=i;
            }
        }
        System.out.println(ans);
    }
}