package Inheritance;
class Animal {
    void eat() {
        System.out.println("Animal is Eating");
    }
}
class Dog extends Animal {
    void Bark(){
        System.out.println("Dog is Barking");
    }
}
class Cat extends Animal{
    void Voice(){
        System.out.println("cat is Meowing");
    }
}
public class Example{
    public static void main(String[] args){
        Dog d = new Dog();
        Cat c = new Cat();
        d.Bark();
        d.eat();
        c.Voice();
    }
}