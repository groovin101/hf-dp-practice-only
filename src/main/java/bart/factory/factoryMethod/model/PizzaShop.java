package bart.factory.factoryMethod.model;

import bart.factory.simpleFactory.model.Pizza;
import bart.factory.simpleFactory.model.PizzaType;

/**
 *
 */
public abstract class PizzaShop {

    /**
     * This is our creational method that will be implemented by subclasses of the PizzaShop class. The rest of the
     * abstract class uses the Pizza interface to perform pizza operations, but it is this *FACTORY METHOD* that will
     * dole out the concrete implementations of the Pizza interface based on type.
     *
     * For example, a Chicago style pizza shop will create a different kind of Cheese Pizza than a New York style shop
     * will create.
     * @param type
     * @return
     */
    protected abstract Pizza createPizza(PizzaType type); //factory method to churn out new pizzas for use

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