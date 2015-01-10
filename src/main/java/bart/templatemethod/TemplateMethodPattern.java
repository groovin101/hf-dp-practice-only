package bart.templatemethod;

import bart.Dox;
import bart.templatemethod.model.BlackCoffee;
import bart.templatemethod.model.Coffee;
import bart.templatemethod.model.Tea;

/**
 * The Template Method pattern shows us how we can define a common template for an algorithm, allowing the algorithm
 * implementation details to differ while preserving the steps of the template.
 */
public class TemplateMethodPattern {

    private static Dox logger = new Dox();

    public static void main(String[] args) {

        brewCoffeeAndTeaToDemonstrateTemplateMethod();
        brewRegularCoffeeAndBlackCoffeeToDemonstrateCustomerInteractionHook();
    }

    private static void brewCoffeeAndTeaToDemonstrateTemplateMethod() {

        logger.printTestTitle("Showing how both coffee and tea follow the same recipe (template), but have different implementations");

        new Coffee().prepareBeverageUsingACommonTemplate();
        logger.blankLine();
        new Tea().prepareBeverageUsingACommonTemplate();
    }

    private static void brewRegularCoffeeAndBlackCoffeeToDemonstrateCustomerInteractionHook() {

        logger.printTestTitle("Showing how we can provide a hook, here via the prepareBeverageUsingACommonTemplateWithAHook template method, then optionally override it in our subclass (BlackCoffee)");

        logger.out("* Regular coffee that does not override the customerWantCondiments() hook - (uses default hook implementation that says yes, the customer wants condiments)");
        new Coffee().prepareBeverageUsingACommonTemplateWithAHook();
        logger.blankLine();
        logger.out("* Black coffee that _does_ override the customerWantCondiments() hook - (overrides hook implementation to say 'no', the customer does not want condiments)");
        new BlackCoffee().prepareBeverageUsingACommonTemplateWithAHook();
    }
}