package src.PL.SDA.Java_Zaawansowana.Zadania.Przyklad;

public class Main {
    public static void main(String[] args) {

        Pair<Integer, String> integerStringPair = new Pair<>(10, "ten");
        System.out.println(integerStringPair);

        Pair<String, Integer> stringIntegerPair = new Pair<>("Whatever", 25);
        System.out.println(stringIntegerPair);

    }
}
