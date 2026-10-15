package basics;
public class operators {
    public static void main(String[] args) {
        int a = 12, b = 10;
        System.out.printf("%.2f\n" , 6.155422);
        System.out.println("--- Arithmetic ---");
        System.out.println(a + b);   // 22
        System.out.println(a - b);   // 2
        System.out.println(a * b);   // 120
        System.out.println(a / b);   // 1
        System.out.println(a % b);   // 2
        System.out.println(++a);     //13
        System.out.println(b--);     //10

        System.out.println("--- Relational ---");
        System.out.println(a == b);  // false
        System.out.println(a != b);  // true
        System.out.println(a > b);   // true
        System.out.println(a < b);   // false

        System.out.println("--- Logical ---");
        System.out.println(a > 5 && b > 5);    // true
        System.out.println(a > 20 || b > 5);   // true
        System.out.println(!(a > b));          // false

        System.out.println("--- Bitwise ---");
        System.out.println(a & b);   // 8
        System.out.println(a | b);   // 14
        System.out.println(a ^ b);   // 6
        System.out.println(~a);      // -13
        System.out.println(a << 1);  // 24
        System.out.println(a >> 1);  // 6
    }
}