package bart.factory.factoryMethod.model;

import bart.factory.simpleFactory.model.ChicagoCheesePizza;
import bart.factory.simpleFactory.model.ChicagoPepperoniPizza;
import bart.factory.simpleFactory.model.Pizza;
import bart.factory.simpleFactory.model.PizzaType;

/**
 *
 */
public class PizzaShopInChicago extends PizzaShopUsingFactoryMethod {

    @Override
    public Pizza createPizza(PizzaType type) {
        if (type.equals(PizzaType.CHEESE)) {
            return new ChicagoCheesePizza();
        }
        else if (type.equals(PizzaType.PEPPERONI)) {
            return new ChicagoPepperoniPizza();
        }
        else throw new IllegalArgumentException("Invalid type of pizza requested");
    }
}
