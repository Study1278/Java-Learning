import java.util.Scanner;
class LCM {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the No. A and B");
        int a=s.nextInt();
        int b=s.nextInt();
        int max =Math.max(a,b);
        int x=a*b;
        int ans=1;
        for (int i=max;i<=x;i++){
            if(i%a==0 && i%b==0){
                ans=i;
                break;
            }
        }
        System.out.println(ans);
    }
}