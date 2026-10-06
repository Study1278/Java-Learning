package JavaClassObject;
public class JavaClassObject{
    public static void main(String... args){
        Pokemon P1 = new Pokemon();

        P1.name= "Pikachu";
        P1.level= 10;

        Pokemon P2 = new Pokemon();

        P2.name = "Raichu";
        P2.level = 20;

        P2.attack();

        System.out.println(P1.name + "  " + P1.level);

        Pokemon P3 = new Pokemon();

        System.out.println(P3.level);

        Pokemon P4 = new Pokemon ("Puff",50);
        System.out.println(P4.level);
        P4.attack();
    }
}