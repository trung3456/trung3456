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
        // create Oj
        Chicken ga = new Chicken();
        ga.nameOfAnimal();
    }
}