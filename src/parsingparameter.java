import java.util.Scanner;

class parsingparameter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No.");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(getsmax(x,y) + "  is greater");
    }
    public static int getsmax(int x, int y){
        if (x>y){
            return x;
        }else{
            return y;
        }
    }
}