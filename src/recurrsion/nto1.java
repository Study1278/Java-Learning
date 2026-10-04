import java.util.Scanner;
class nto1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        func(n);
    }
    static void func(int n){
        if(n==0)
            return ;
        System.out.print(n + "  ");
        func(n-1);
    }
}