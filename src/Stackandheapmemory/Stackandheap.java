package Stackandheapmemory;
class Calculator {
    int num =5; //instance variable
    int add(int a, int b){
        return a+b;
    }
}
public class Stackandheap {
    public static void main(String[] args){
        Calculator obj = new Calculator();
        Calculator obj1 = new Calculator();
        int r1 = obj.add(3,4);
       // System.out.println(r1);
        Calculator ob11 = new Calculator();
        obj.num = 1;
        System.out.println(obj.num);
        System.out.println(obj1.num);
    }
}