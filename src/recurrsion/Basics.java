class Basics {
    public static void main(String[] args){
        func1(3);
        System.out.println("Next Function :- 2");
        func2(3);
        System.out.println("Next Function :- 3");
        System.out.println(func3(16));
    }
    static void func1(int n){
        if (n==0)
            return;
        System.out.println(n);
        func1(n-1);
        System.out.println(n);
    }

    static void func2(int n ){
        if (n==0)
            return;
        func2(n-1);
        System.out.println(n);
        func2(n-1);
    }

    static int func3(int n) {
        if (n == 1)
            return 0;
        else
            return 1+func3(n/2);
    }
}