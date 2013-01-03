package bart.factory.abstractFactory.model;

import bart.factory.factoryMethod.model.PizzaShop;
import bart.factory.simpleFactory.model.Pizza;
import bart.factory.simpleFactory.model.PizzaSimpleFactory;
import bart.factory.simpleFactory.model.PizzaType;

/**
 */
public class PizzaShopInChicagoAF extends PizzaShop {

    @Override
    protected Pizza createPizza(PizzaType type) {
        if (type.equals(PizzaType.CHEESE)) {
            return PizzaCreatorFactoryForChicago.create(PizzaType.CHEESE);
        }
    }
}
