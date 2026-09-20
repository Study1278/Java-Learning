import java.util.Scanner;
class table {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the No. ");
        int table=s.nextInt();
        System.out.print("Enter the No. Where the table End : ");
        int m=s.nextInt();
        for(int i =1 ; i<=m ; i++){
            System.out.print(i*table + "    ");
        }
    }
}