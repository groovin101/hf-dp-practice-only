package bart.factory;

import bart.factory.factoryMethod.model.PizzaShopAnytownUsa;
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
        demoFactoryMethodPattern();
    }

    private static void demoFactoryMethodPattern() {

        System.out.println("\n*************************Demo-ing the factory method pattern\n");

        System.out.println("------------------------------------");
        System.out.println("Heading to AnyTown....");
        System.out.println("------------------------------------");

        PizzaShopUsingFactoryMethod fmShopInAnytownUsa = new PizzaShopAnytownUsa();
        fmShopInAnytownUsa.orderPizza(PizzaType.CHEESE);
        System.out.println("  ------------------------------------");
        fmShopInAnytownUsa.orderPizza(PizzaType.PEPPERONI);

        System.out.println("------------------------------------");
        System.out.println("Heading to Chicago....");
        System.out.println("------------------------------------");


        PizzaShopUsingFactoryMethod fmShopInChicago = new PizzaShopInChicago();
        fmShopInChicago.orderPizza(PizzaType.CHEESE);
        System.out.println("  ------------------------------------");
        fmShopInChicago.orderPizza(PizzaType.PEPPERONI);
    }

    private static void demoSimpleFactoryPseudoPattern() {

        System.out.println("\n*************************Demo-ing the simple factory PSEUDO pattern\n");

        System.out.println("------------------------------------");
        System.out.println("Heading to AnyTown....");
        System.out.println("------------------------------------");

        PizzaShop bartsShop = new PizzaShop(new PizzaSimpleFactoryRegularImpl());
        bartsShop.orderPizza(PizzaType.CHEESE);
        System.out.println("  ------------------------------------");
        bartsShop.orderPizza(PizzaType.PEPPERONI);

        System.out.println("------------------------------------");
        System.out.println("Heading to Chicago....");
        System.out.println("------------------------------------");

        PizzaShop bartsShopInChicago = new PizzaShop(new PizzaSimpleFactoryChicagoStyleImpl());
        bartsShopInChicago.orderPizza(PizzaType.CHEESE);
        System.out.println("  ------------------------------------");
        bartsShopInChicago.orderPizza(PizzaType.PEPPERONI);
    }
}
