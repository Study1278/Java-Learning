package basics;
class Types{
    public static void main(String[] args){
        int age =21;
        long population= 800000000L;
        float price = 99.99F;
        double pi = 3.141592653589793;
        char grade = 'A';
        boolean passed = true;

        System.out.println(age + " " + population);
        System.out.println(price + " " + pi);
        System.out.println(grade + " " + passed);

        System.out.println(Integer.MAX_VALUE);    //2147483647
        System.out.println(Integer.MAX_VALUE+1);  // ovweflow : -214748648
        System.out.println(Integer.MIN_VALUE -1);  // overflow : 214748648
        // for avoid this overflow USED LONG DATA TYPE -
        System.out.println((long)Integer.MAX_VALUE +1);
        System.out.println(Long.MAX_VALUE);
        System.out.println(0.1+0.2);             // 0.3000000004
    }
}