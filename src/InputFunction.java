import java.util.Scanner;
public class InputFunction {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("You Entered Strig: " + s);
        int x = sc.nextInt();
        System.out.println("You Entered Integer: " +  x);
        float y = sc.nextFloat();
        System.out.println("You Entered Float: " + y);
    }
}

