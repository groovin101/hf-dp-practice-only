package bart.factory;

import bart.factory.factoryMethod.model.PizzaShopInChicago;
import bart.factory.factoryMethod.model.PizzaShopUsingFactoryMethod;
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

    private static void demoFactoryMethodPattern() {

        System.out.println("Demo-ing the factory method pattern\n");

        PizzaShopUsingFactoryMethod fmShopInChicago = new PizzaShopInChicago();
        fmShopInChicago.orderPizza(PizzaType.CHEESE);
        fmShopInChicago.orderPizza(PizzaType.PEPPERONI);

        System.out.println("------------------------------------");
        System.out.println("Heading to Chicago....");
        System.out.println("------------------------------------");

    }

    private static void demoSimpleFactoryPseudoPattern() {

        System.out.println("Demo-ing the simple factory pseudo pattern\n");

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
