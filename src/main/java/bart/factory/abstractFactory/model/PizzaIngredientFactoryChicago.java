package bart.factory.abstractFactory.model;

import bart.factory.abstractFactory.model.ingredients.*;

/**
 */
public class PizzaIngredientFactoryChicago implements PizzaIngredientFactory {

    public Dough createDough() {
        return new DoughThickCrustImpl();
    }

    public Cheese createCheese() {
        return new CheeseMozarellaImpl();
    }

    public Sauce createSauce() {
        return new SaucePlumTomatoImpl();
    }
    public Pepperoni createPepperoni() {
        return new PepperoniSlicedImpl();
    }
}
