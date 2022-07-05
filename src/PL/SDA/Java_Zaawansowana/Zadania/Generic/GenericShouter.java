package src.PL.SDA.Java_Zaawansowana.Zadania.Generic;

public class GenericShouter <T>{

    private T thingToShout;

    public GenericShouter(T thingToShout){
        this.thingToShout = thingToShout;
    }

    public void shout1(){
        System.out.println(thingToShout + "!!!!!");
    }



}
