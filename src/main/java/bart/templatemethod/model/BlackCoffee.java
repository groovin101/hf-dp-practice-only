package bart.templatemethod.model;

/**
 * This implementation takes advantage of the hook that the CaffeinatedBeverage implementation provides us.
 */
public class BlackCoffee extends Coffee {

    /**
     * Override the hook to be used by the template method. This implementation takes user input to decide if the user
     * wants condiments or not, rather than assuming that they do (as in the default impl provided by the abstract
     * CaffeinatedBeverage class.
     *
     * @return boolean - whether the user wants condiments.
     */
    @Override
    protected boolean customerWantCondiments() {

        logger.out("Customer says: 'No condiments! I only drink my coffee black'");
        return false;
    }
}
