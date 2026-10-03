import java.util.Scanner;
class Switchcase {
    public static void main(String[] args){
        int x=0,y=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Move");
        char move = sc.next().charAt(0);
        switch (move){
            case 'L' : x--;
            System.out.println(x);
            break;
            case 'R' : x++;
            System.out.println(x);
            break;
            case 'U' : y++;
            System.out.println(y);
            break;
            case 'D' : y--;
            System.out.println(y);
            break;
            default:
                System.out.println("Invalid");
        }
    }
}