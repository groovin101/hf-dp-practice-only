package bart.factory.abstractFactory.model;

import bart.factory.abstractFactory.model.ingredients.Cheese;
import bart.factory.abstractFactory.model.ingredients.Dough;
import bart.factory.abstractFactory.model.ingredients.Pepperoni;
import bart.factory.abstractFactory.model.ingredients.Sauce;

/**
 */
public interface PizzaIngredientFactory {

    public Dough createDough();
    public Cheese createCheese();
    public Sauce createSauce();
    public Pepperoni createPepperoni();
}
