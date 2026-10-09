package AccessModifiers;
public class A {
    int Marks=6;
    public int Mar = 5;
    private int M = 2;
    protected int Ma = 1;
    public static void show1(){
        System.out.print("hello");;
    }
    public static void main(String[] args){
        A obj = new A();
        System.out.print(obj.M);
    }
}
