import java.util.Scanner;
class onlyif {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N no.");
        int n = sc.nextInt();
        if(n<0){
            System.out.println("This no. is invalid");
            return;
        }
        System.out.println((n*(n+1))/2);
    }
}