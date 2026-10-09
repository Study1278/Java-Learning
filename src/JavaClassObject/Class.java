class Calculator {
    int a;
    public static int add(int n1, int n2){
        int result = n1+n2;
        return result;
    }
}
class Calc {
    int n;

    public static int add(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }
}
public class Class {
    public static void main(String[] args){
        int num1 = 4, num2 = 5;
        //int result = num1+num2;
        //System.out.print(result);
        Calculator calc = new Calculator();
        Calc kal = new Calc();
        int result1 = kal.add(num1,num2);
        int result = calc.add(num1,num2);
        System.out.print(result1+ " " +result);
    }
}