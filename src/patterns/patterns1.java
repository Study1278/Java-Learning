import java.util.Scanner;
class patterns1 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the No. ");
        int n=s.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}