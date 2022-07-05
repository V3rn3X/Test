package src.PL.SDA.Java_Zaawansowana.Zadania.AnimalHouse;

public class AnimalHouse {

    private Animal[] animals = new Animal[3];

    void addAnimal(Animal animal, int index){
        animals[index] = animal;
    }
}

abstract class Animal {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract  String getKind();
}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    String getKind(){
        return "Cat";
    }
}

class GuineaPig extends Animal {

    public GuineaPig(String name) {
        super(name);
    }

    String getKind(){
        return "Cat";
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    String getKind(){
        return "Cat";
    }
}