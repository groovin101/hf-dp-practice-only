package bart.factory.abstractFactory.model;

import bart.factory.abstractFactory.model.pizzas.CheesePizzaAF;
import bart.factory.abstractFactory.model.pizzas.PepperoniPizzaAF;
import bart.factory.factoryMethod.model.PizzaShop;
import bart.factory.simpleFactory.model.Pizza;
import bart.factory.simpleFactory.model.PizzaType;

/**
 */
public class PizzaShopInNewYorkAF extends PizzaShop {

    @Override
    protected Pizza createPizza(PizzaType type) {
        if (type.equals(PizzaType.CHEESE)) {
            return (Pizza)new CheesePizzaAF(new PizzaIngredientFactoryNewYork());
        }
        else if (type.equals(PizzaType.PEPPERONI)) {
            return (Pizza)new PepperoniPizzaAF(new PizzaIngredientFactoryNewYork());
        }
        throw new IllegalArgumentException("This shop only makes pepperoni or cheese pizzas");
    }
}
