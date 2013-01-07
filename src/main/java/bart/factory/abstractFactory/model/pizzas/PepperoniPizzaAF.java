package bart.factory.abstractFactory.model.pizzas;

import bart.factory.abstractFactory.model.PizzaIngredientFactory;

/**
 */
public class PepperoniPizzaAF extends BasePizzaAF {

    private PizzaIngredientFactory ingredientFactory;

    @Override
    public String getDescription() {
        return "Pepperoni Za from the factory";
    }

    /**
     * Instantiate using a factory that will be responsible for supplying concrete implementations of our ingredient
     * interfaces
     * @param ingredientFactory
     */
    public PepperoniPizzaAF(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {

        cheese = ingredientFactory.createCheese();
        dough = ingredientFactory.createDough();
        pepperoni = ingredientFactory.createPepperoni();
        sauce = ingredientFactory.createSauce();
        System.out.println("Preparing a " + getDescription() + " using the following ingredients: ");
        System.out.println(" [" + cheese + ", " + dough + ", " + pepperoni + ", and " + sauce + "]");
    }
}
