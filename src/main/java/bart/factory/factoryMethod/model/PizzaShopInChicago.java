package bart.factory.factoryMethod.model;

import bart.factory.simpleFactory.model.ChicagoCheesePizza;
import bart.factory.simpleFactory.model.ChicagoPepperoniPizza;
import bart.factory.simpleFactory.model.Pizza;
import bart.factory.simpleFactory.model.PizzaType;

/**
 * This class violates the Dependency Inversion Principle because it is dependent on concrete low-level components (the
 * individual pizza implementations) rather than abstractions
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
