package bart.factory.simpleFactory.model;

/**
 *
 */
public class PizzaShopUsingSimpleFactory {

    private PizzaSimpleFactory pizzaSimpleFactory;

    public PizzaShopUsingSimpleFactory(PizzaSimpleFactory simpleFactory) {
        pizzaSimpleFactory = simpleFactory;
    }

    public Pizza orderPizza(PizzaType type) {

        Pizza pizza = pizzaSimpleFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
