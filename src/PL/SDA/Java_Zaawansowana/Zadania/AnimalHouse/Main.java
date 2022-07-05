package src.PL.SDA.Java_Zaawansowana.Zadania.AnimalHouse;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Czarek");
        Animal dog = new Dog("Piksel");
        Animal pig = new GuineaPig("Pupa");

        AnimalHouse house = new AnimalHouse();
        house.addAnimal(cat, 0);
        house.addAnimal(dog, 1);
        house.addAnimal(pig, 2);

        System.out.println("3 animals added");
        System.out.println("#########");

    }
}
