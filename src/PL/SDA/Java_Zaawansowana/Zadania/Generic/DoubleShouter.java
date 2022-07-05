package src.PL.SDA.Java_Zaawansowana.Zadania.Generic;

public class DoubleShouter {

        private final double thingToShout;

        public DoubleShouter(double thingToShout) {
            this.thingToShout = thingToShout;
        }

        public void shout(){
            System.out.println(thingToShout + "!!!!!!");
        }
}

