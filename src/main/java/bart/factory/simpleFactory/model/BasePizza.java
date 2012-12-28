package bart.factory.simpleFactory.model;

/**
 *
 */
public abstract class BasePizza implements Pizza {

    public abstract String getDescription();

    public void prepare() {
        System.out.println("Preparing a " + getDescription());
    }
    public void bake() {
        System.out.println("Baking a " + getDescription());
    }
    public void cut() {
        System.out.println("Cutting a " + getDescription());
    }
    public void box() {
        System.out.println("Boxing a " + getDescription());
    }
}
