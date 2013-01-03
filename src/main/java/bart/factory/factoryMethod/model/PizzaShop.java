package bart.factory.factoryMethod.model;

import bart.factory.simpleFactory.model.Pizza;
import bart.factory.simpleFactory.model.PizzaType;

/**
 *
 */
public abstract class PizzaShop {

    protected abstract Pizza createPizza(PizzaType type);

    public Pizza orderPizza(PizzaType type) {

        //Pizza pizza = pizzaSimpleFactory.createPizza(type);
        //Use a factory method on the PizzaShop itself, implemented in the subclasses themselves.
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
