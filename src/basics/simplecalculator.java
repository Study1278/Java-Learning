import java.util.Scanner;
class simplecalculator {
    public static void main(String[] args) {
        int a=0 ;int b = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Simple Calculator\n 1. Addition\n 2. Subtraction\n 3. Multiplication\n");
        System.out.println("Enter the operation");
        int operation = s.nextInt();
        if (operation != 1 && operation != 2 && operation != 3) {
            System.out.print("invalid Input");
            return;
        } else {
            System.out.print("Enter First No. :- ");
            a = s.nextInt();
            System.out.print("Enter Second No. :-");
            b = s.nextInt();
        }
        if(operation==1)
            System.out.print("Addition is " + (a+b));
        else if (operation==2)
            System.out.print("Subtraction is " + (a-b));
        else{
            System.out.print("Multiplication is " + (a*b));
        }
    }
}