import java.util.Scanner;
class nestedifelse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No.");
        int n = sc.nextInt();
        if(n>0){
            if(n%2==0){
                System.out.println("This No. Positive Evne");
            } else{
                System.out.println("This No. is Positive Odd");
            }
        }else if(n<0){
            if(n%2==0){
                System.out.println("This No. is Negative Even");
            }else{
                System.out.println("This No. is Negative Odd");
            }
        } else if(n==0){
            System.out.println("This is Zero (Not even or Odd)");
        }
    }
}
