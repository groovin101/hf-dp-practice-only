package bart.strategy;

/**
 *
 */
public abstract class Duck {

    public String getName() {
        return this.getClass().getSimpleName();
    }

    public void fly() {
        System.out.println("Look, I'm a " + getName() + " and I'm flying!");
    }

    public void quack() {
        System.out.println("Quack!");
    }

    public void swim() {
        System.out.println("Swim duck!");
    }

    public abstract void display();
}