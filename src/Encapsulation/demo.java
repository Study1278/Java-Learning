package Encapsulation;
class human {
    private int  age;
    private String name;

    public int getAge() {
        return age;
    }

    /*public void setAge(int age, human A) {
        human obj1 = A;
        A.age = age; //
    }*/
    public void setAge(int age){     // "This" keyword is replace this and represent the current object
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class demo {
    public static void main(String[] args){
        human A = new human();
        //A.age = 15;
       // A.setAge(35, A);   // "This" keyword is replace this and represent the current object
        A.setAge(35);
        //A.name = "Mayank";
        A.setName("Mayank");
        System.out.print(A.getAge() + " : " +A.getName());
    }
}