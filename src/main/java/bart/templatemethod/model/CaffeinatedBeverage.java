package bart.templatemethod.model;

import bart.Dox;

/**
 */
public abstract class CaffeinatedBeverage {

    protected Dox logger;

    protected CaffeinatedBeverage() {
        logger = new Dox();
    }

    /**
     * This is the template method itself, defining the common steps in an algorithm, without all of the implementation
     * details that may vary by implementors.
     *
     * Made this final so that subclasses understand the intent is to follow this template. No overriding.
     */
    public final void prepareBeverageUsingACommonTemplate() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /**
     * This is also a template method, but it provides a hook for the client to override, if they wish; they don't have to.
     */
    public final void prepareBeverageUsingACommonTemplateWithAHook() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantCondiments()) {
            addCondiments();
        }
        else {
            logger.out("Looks like the customer did not want condiments. Serving beverage without them.");
        }
    }

    private void boilWater() {
        logger.out("Boiling water");
    }

    private void pourInCup() {
        logger.out("Pouring beverage into a cup");
    }

    /**
     * Serve as a hook that the client can override. We provide a default implementation in case the client chooses not
     * to override.
     * @return boolean
     */
    protected boolean customerWantCondiments() {
        return true;
    }

    protected abstract void brew();
    protected abstract void addCondiments();
}