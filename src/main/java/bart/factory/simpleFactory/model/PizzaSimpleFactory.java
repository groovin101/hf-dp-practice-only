package bart.factory.simpleFactory.model;

import bart.factory.simpleFactory.model.CheesePizza;
import bart.factory.simpleFactory.model.PepperoniPizza;
import bart.factory.simpleFactory.model.Pizza;
import bart.factory.simpleFactory.model.PizzaType;

/**
 *
 */
public class PizzaSimpleFactory {

    public Pizza createPizza(PizzaType type) {
        if (type.equals(PizzaType.CHEESE)) {
            return new CheesePizza();
        }
        else if (type.equals(PizzaType.PEPPERONI)) {
            return new PepperoniPizza();
        }
        else throw new IllegalArgumentException("Invalid type of pizza requested");
    }
}
