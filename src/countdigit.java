import java.util.Scanner;
class countdigit {
    public static void main(String[] args){
        int count=0;
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the No.");
        int nums = s.nextInt();
        while(nums>0){
            count++;
            nums=nums/10;
        }
        System.out.println("No. of digits is " + count);
    }
}