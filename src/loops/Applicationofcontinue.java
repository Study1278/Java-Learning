import java.util.Scanner;
class Applicationofcontinue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Division\nEnter the First No,");
            int a = s.nextInt();
            System.out.println("Enter the Second No.");
             int b = s.nextInt();
             if (b == 0) {
                 System.out.println("Invalid input (ZERO)");
                 continue;
             }
                 System.out.println("Result=" + (a / b));
             }
        }
    }