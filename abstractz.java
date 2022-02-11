import java.util.Scanner;

// create abstract class and abstract method "nameOfAnimal"
abstract class Animal{
    public abstract void nameOfAnimal();
}

// class chiken class extends from Animal class
class Chicken extends Animal {
    public void nameOfAnimal(){
        System.out.println("It's a chiken");
    }
}

class abstractz {
    public static void main(String[] args) {
        // Check type of variable
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name.getClass().getSimpleName());

        // create Oj
        Chicken ga = new Chicken();
        ga.nameOfAnimal();

        hello t2 = new hello();
        t2.seta(5);
        t2.setName("Trungpro");
        System.out.println(t2.geta());
        System.out.println(t2.getName());
    }
}