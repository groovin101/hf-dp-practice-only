package bart.factory.simpleFactory.model;

/**
 *
 */
public class PizzaShop {

    public Pizza orderPizza(PizzaType type) {

        Pizza pizza = new PizzaSimpleFactory().createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
