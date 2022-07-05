package src.PL.SDA.Java_Zaawansowana.Zadania.GenericMetodExample;

public class GenericMethodExample {
    public static void main(String[] args) {
        shout("Damn");
    }

    private static <T> void shout(T sthToShout){
        System.out.println(sthToShout + "!!!!!!!!!!!!!!!");
    }

}
