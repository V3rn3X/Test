package src.PL.SDA.Java_Zaawansowana.Zadania.Array;
import java.util.Arrays;

public class Exercise {

    public static void main(String[] args) {
        Integer[] tab = {10, 21, 33, 40, 50, 60};
        ArrayUtils.swap(tab, 2, 5);
        System.out.println(Arrays.toString(tab));


        String[] stringTab = {"One", "Two", "Three", "Four", "Five", "Six"};
        ArrayUtils.swap(stringTab, 2, 3);
        System.out.println(Arrays.toString(stringTab));
    }
}


class ArrayUtils {
    // zaimplementuj generyczna metodę swap która bedzie odpowiedzialna za zmiane pozycji wskazanych elementów tablicy

    public static final <T> void swap (T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
