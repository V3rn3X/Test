package src.PL.SDA.Java_Zaawansowana.Zadania.Generic;

public class MainShouter {
    public static void main(String[] args) {


        DoubleShouter doubleShouter = new DoubleShouter(10.6);
        doubleShouter.shout();

        GenericShouter<Integer> integerShouter = new GenericShouter<>(10);
        integerShouter.shout1();

        GenericShouter<Double> doubleShouter1 = new GenericShouter<>(10.3);
        doubleShouter1.shout1();


    }
}
