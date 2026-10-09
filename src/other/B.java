import AccessModifiers.*;
class B{
    public static void main(String a[]){
        A marks = new A();
        A.show1();
        System.out.print(marks.Mar);
       // System.out.print(marks.Ma);  We counld't access the protected variablble in same package also
       // System.out.print(marks.M);   We counld't access the private variablble in same package also
    }
}