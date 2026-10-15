package basics;
import java.util.Scanner;
class Input {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Age : - ");
        int age = sc.nextInt();
        System.out.print("Enter the Marks :- ");
        double Marks = sc.nextDouble();
        System.out.println(age +" " + Marks);


        // Fix 1 : eat the leftover newline
        System.out.print("Age: ");
        int Age= sc.nextInt();
        sc.nextLine();               //Consume the Enter
        System.out.print("Name: ");  // now works
        String Name = sc.nextLine();
        System.out.println(Age + " " + Name);

        //Fix 2 : always read lines, then converts
        System.out.print("Age: ");
        int age2 = Integer.parseInt(sc.nextLine());
        System.out.print("Name: ");
        String name2 = sc.nextLine();
        System.out.println(age2 +" " + name2);
    }
}