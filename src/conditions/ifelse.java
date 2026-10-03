import java.util.Scanner;
 class ifelse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("This no. is Even");
        }else{
            System.out.println("This no. is odd");
        }

    }
}