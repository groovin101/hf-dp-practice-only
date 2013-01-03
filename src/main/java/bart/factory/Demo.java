package bart.factory;

import bart.factory.factoryMethod.model.PizzaShop;
import bart.factory.factoryMethod.model.PizzaShopInChicago;
import bart.factory.factoryMethod.model.PizzaShopInChicagoThatHasGoneRogue;
import bart.factory.simpleFactory.model.PizzaShopUsingSimpleFactory;
import bart.factory.simpleFactory.model.PizzaSimpleFactoryChicagoStyleImpl;
import bart.factory.simpleFactory.model.PizzaSimpleFactoryRegularImpl;
import bart.factory.simpleFactory.model.PizzaType;

/**
 *
 */
public class Demo {

    public static void main(String[] args) {
        demoSimpleFactoryPseudoPattern();
        demoFactoryMethodPattern();
    }

    private static void demoFactoryMethodPattern() {

        System.out.println("\n*************************Demo-ing the factory method pattern\n");

        System.out.println("------------------------------------");
        System.out.println("Heading to Chicago....");
        System.out.println("------------------------------------");

        PizzaShop fmShopInChicago = new PizzaShopInChicago();
        fmShopInChicago.orderPizza(PizzaType.CHEESE);

        System.out.println("------------------------------------");
        System.out.println("Heading to Chicago's bad part of town....");
        System.out.println("------------------------------------");


        PizzaShop nastyShopInChicago = new PizzaShopInChicagoThatHasGoneRogue();
        nastyShopInChicago.orderPizza(PizzaType.CHEESE);
    }

    private static void demoSimpleFactoryPseudoPattern() {

        System.out.println("\n*************************Demo-ing the simple factory PSEUDO pattern\n");

        System.out.println("------------------------------------");
        System.out.println("Heading to AnyTown....");
        System.out.println("------------------------------------");

        PizzaShopUsingSimpleFactory bartsShop = new PizzaShopUsingSimpleFactory(new PizzaSimpleFactoryRegularImpl());
        bartsShop.orderPizza(PizzaType.CHEESE);
        System.out.println("  ------------------------------------");
        bartsShop.orderPizza(PizzaType.PEPPERONI);

        System.out.println("------------------------------------");
        System.out.println("Heading to Chicago....");
        System.out.println("------------------------------------");

        PizzaShopUsingSimpleFactory bartsShopInChicago = new PizzaShopUsingSimpleFactory(new PizzaSimpleFactoryChicagoStyleImpl());
        bartsShopInChicago.orderPizza(PizzaType.CHEESE);
        System.out.println("  ------------------------------------");
        bartsShopInChicago.orderPizza(PizzaType.PEPPERONI);
    }
}
