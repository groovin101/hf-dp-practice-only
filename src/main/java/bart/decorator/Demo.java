package bart.decorator;

import bart.decorator.model.HouseBlend;
import bart.decorator.model.MochaDecorator;
import bart.decorator.model.SoyDecorator;

/**
 *
 */
public class Demo {

    public static void main(String[] args) {

        HouseBlend cupOJoe = new HouseBlend();

        System.out.println("How much for a cup o joe?");
        System.out.println(cupOJoe.cost());
        System.out.println(" With mocha?");
        System.out.println(" " + new MochaDecorator(cupOJoe).cost());
        System.out.println(" With mocha and soy?");
        System.out.println(" " + new MochaDecorator(new SoyDecorator(cupOJoe)).cost());
        System.out.println("\n\n");

//        Espresso espresso = new Espresso();
//        System.out.println("How much for an espresso?");
//        System.out.println(espresso.cost());
//        System.out.println(" With mocha?");
//        espresso.addCondiment(new MochaDecorator());
//        System.out.println(" " + espresso.cost());
//        System.out.println(" With mocha and soy?");
//        espresso.addCondiment(new SoyDecorator());
//        System.out.println(" " + espresso.cost());
    }
}
