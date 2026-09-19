/*
//Fins the Greatest No. By If Else
import java.util.Scanner;
class LargestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a >= b && a >= c) {
            System.out.print("Greatest No." + a);
        } else if (b>=a && b >= c) {
            System.out.print("Greatest No." + b);
        } else {
            System.out.println("Greatest no." + c);
        }
    }
}*/
//Find Greatest by Math.max Function
import java.util.Scanner;
class LargestNo {
    public static void main(String[] args){
        System.out.println("Enter the No.");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans1 = Math.max(a,b);
        int ans = Math.max(ans1,c);
        System.out.println("Greatest No. is " + ans);
    }
}

