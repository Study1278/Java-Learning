package AccessModifiers;

class C extends A {
    public void show(){
        System.out.print(Ma);
    }
}
class AccessModifiers{
    public static void main(String a[]){
        A marks = new A();
        System.out.print(marks.Marks);
        A.show1();
        System.out.print(marks.Ma);
       // System.out.print(marks.M);      We could't access the private variable from different package
    }
}