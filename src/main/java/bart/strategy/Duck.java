package bart.strategy;

/**
 *
 */
public abstract class Duck {

    public void quack() {
        System.out.println("Quack!");
    }

    public void swim() {
        System.out.println("Swim duck!");
    }

    public abstract void display();
}