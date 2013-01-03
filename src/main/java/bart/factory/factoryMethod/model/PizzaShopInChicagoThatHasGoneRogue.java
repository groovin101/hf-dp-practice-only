package bart.factory.factoryMethod.model;

import bart.factory.simpleFactory.model.Pizza;
import bart.factory.simpleFactory.model.PizzaType;

/**
 */
public class PizzaShopInChicagoThatHasGoneRogue extends PizzaShop {

    @Override
    protected Pizza createPizza(PizzaType type) {
        if (type.equals(PizzaType.CHEESE)) {
            return new ChicagoCheesePizzaUsingMoldyRottenCheese();
        }
        else throw new IllegalArgumentException("Invalid type of pizza requested");
    }
}
