import java.util.Scanner;
class Methods {

public static void main(String[] args) {
    System.out.println("Before Call");
    fun1();
    System.out.println("After Call");
     }

     public static void fun1(){
    System.out.println("Fun1 Begins");
    Fun2();
    System.out.println("Fun 1 Ends");
     }
     public static void Fun2(){
    System.out.println("inside inside the more fun");
     }
}