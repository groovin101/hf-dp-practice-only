package bart.factory;

import bart.factory.simpleFactory.model.PizzaShop;
import bart.factory.simpleFactory.model.PizzaType;

/**
 *
 */
public class Demo {

    public static void main(String[] args) {
        demoSimpleFactoryPseudoPattern();
    }

    private static void demoSimpleFactoryPseudoPattern() {

        PizzaShop bartsShop = new PizzaShop();

        bartsShop.orderPizza(PizzaType.CHEESE);
        bartsShop.orderPizza(PizzaType.PEPPERONI);
    }
}
