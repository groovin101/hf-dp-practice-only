package bart.factory.abstractFactory.model;

import bart.factory.abstractFactory.model.ingredients.*;

/**
 */
public class PizzaIngredientFactoryNewYork implements PizzaIngredientFactory {

    public Dough createDough() {
        return new DoughThinCrustImpl();
    }
    public Cheese createCheese() {
        return new CheeseReggianoImpl();
    }
    public Sauce createSauce() {
        return new SauceMarinaraImpl();
    }
    public Pepperoni createPepperoni() {
        return new PepperoniSlicedImpl();
    }
}
