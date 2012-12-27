package bart.factory;

import bart.factory.simpleFactory.model.PizzaShop;
import bart.factory.simpleFactory.model.PizzaSimpleFactoryChicagoStyleImpl;
import bart.factory.simpleFactory.model.PizzaSimpleFactoryRegularImpl;
import bart.factory.simpleFactory.model.PizzaType;

/**
 *
 */
public class Demo {

    public static void main(String[] args) {
        demoSimpleFactoryPseudoPattern();
    }

    private static void demoSimpleFactoryPseudoPattern() {

        PizzaShop bartsShop = new PizzaShop(new PizzaSimpleFactoryRegularImpl());
        bartsShop.orderPizza(PizzaType.CHEESE);
        bartsShop.orderPizza(PizzaType.PEPPERONI);

        System.out.println("------------------------------------");
        System.out.println("Heading to Chicago....");
        System.out.println("------------------------------------");

        PizzaShop bartsShopInChicago = new PizzaShop(new PizzaSimpleFactoryChicagoStyleImpl());
        bartsShopInChicago.orderPizza(PizzaType.CHEESE);
        bartsShopInChicago.orderPizza(PizzaType.PEPPERONI);
    }
}
