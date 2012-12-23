package bart.decorator;

import bart.decorator.model.Espresso;
import bart.decorator.model.HouseBlend;
import bart.decorator.model.Mocha;
import bart.decorator.model.Soy;

/**
 *
 */
public class Demo {

    public static void main(String[] args) {

        HouseBlend cupOJoe = new HouseBlend();

        System.out.println("How much for a cup o joe?");
        System.out.println(cupOJoe.cost());
        System.out.println(" With mocha?");
        cupOJoe.addCondiment(new Mocha());
        System.out.println(" " + cupOJoe.cost());
        System.out.println(" With mocha and soy?");
        cupOJoe.addCondiment(new Soy());
        System.out.println(" " + cupOJoe.cost());
        System.out.println("\n\n");

        Espresso espresso = new Espresso();
        System.out.println("How much for an espresso?");
        System.out.println(espresso.cost());
        System.out.println(" With mocha?");
        espresso.addCondiment(new Mocha());
        System.out.println(" " + espresso.cost());
        System.out.println(" With mocha and soy?");
        espresso.addCondiment(new Soy());
        System.out.println(" " + espresso.cost());
    }
}
