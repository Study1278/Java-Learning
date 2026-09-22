import java.util.Scanner;
class allDivisor {
    public static void main(String[] args){
        System.out.print("Enter the No. ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        for (i = 1; i*i <n; i++) {
            if(n%i==0)
                System.out.print(i + "  ");
        }
        for (; i >=1 ; i--) {
            if (n%i==0)
                System.out.print(" " + n/i);
        }
    }
}