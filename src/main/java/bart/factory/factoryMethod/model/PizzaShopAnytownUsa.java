package bart.factory.factoryMethod.model;

import bart.factory.simpleFactory.model.CheesePizza;
import bart.factory.simpleFactory.model.PepperoniPizza;
import bart.factory.simpleFactory.model.Pizza;
import bart.factory.simpleFactory.model.PizzaType;

/**
 * This class violates the Dependency Inversion Principle because it is dependent on concrete low-level components (the
 * individual pizza implementations) rather than abstractions
 */
public class PizzaShopAnytownUsa extends PizzaShop {

    @Override
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
