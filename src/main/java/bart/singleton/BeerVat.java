package bart.singleton;

/**
 *
 */
public class BeerVat {

    private boolean empty;
    private boolean brewed;
    private static BeerVat beerVatThatIsNotThreadSafe;
    private static BeerVat beerVatCreatedUsingAStaticInitializer = new BeerVat();
    private static volatile BeerVat beerVatCreatedViaDoubleCheckedLocking;

    public boolean isEmpty() {
        return empty;
    }
    public void setEmpty(boolean empty) {
        this.empty = empty;
    }
    public boolean isBrewed() {
        return brewed;
    }
    public void setBrewed(boolean brewed) {
        this.brewed = brewed;
    }

    //CONSTRUCTOR on lockdown
    private BeerVat() {
    }

    /**
     * Keep it static so that it can actually be accessed without an instance...
     *
     * Also note the lazy instantiation - the instance is not created until it is actually needed, ala a request via
     * this method.
     *
     * Note that this version is susceptible to race conditions in a multi-threaded environment, as two instances may
     * be created depending on the state of the beerVat instance at the time the threads enter the method. One thread
     * may be in the process of instantiating while the other comes in and sees the "single" beerVat instance as null,
     * triggering a second instantiation
     */
    public static BeerVat getInstance_susceptibleToMultithreadingProblems() {
        if (beerVatThatIsNotThreadSafe == null) {
            beerVatThatIsNotThreadSafe = new BeerVat();
        }
        return beerVatThatIsNotThreadSafe;
    }

    /**
     * As an alternative to lazy initialization, we have the option of creating our single instance when the class is
     * loaded by using a static initializer like so:
     *      private static BeerVat beerVatCreatedUsingAStaticInitializer = new BeerVat();
     * which could then be returned via our static getInstance() method. This would have a downside if the creation of
     * the instance is expensive, or if we don't actually need to use the class every time that the application is used.
     */
    public static BeerVat getInstance_staticallyInitializedInstance() {
        return beerVatCreatedUsingAStaticInitializer;
    }

    /**
     * This solves the race condition pointed out above, but does so using synchronization (ie expensive). To make
     * matters worse, synchronization is truly only needed the first time this method is accessed (ie when beerVat is
     * null and needs instantiation). After that, synchronization is just unnecessary overhead
     */
    public static synchronized BeerVat getInstance_usingExpensiveSynchronization() {
        if (beerVatThatIsNotThreadSafe == null) {
            beerVatThatIsNotThreadSafe = new BeerVat();
        }
        return beerVatThatIsNotThreadSafe;
    }

    /**
     * Great explanation of volatile and double-checked locking here [summary below]: http://jeremymanson.blogspot.com/2008/11/what-volatile-means-in-java.html
     *
     * This version of getInstance will only synchronize if the single instance is being instantiated, otherwise we will
     * not be forced to pay the synchronization cost for accessing the already-created instance
     *
     * We use volatile to ensure that the changes done by our thread while synchronized will be seen by other threads
     */
    public static synchronized BeerVat getInstance_usingTheDoubleCheckedLockingPattern() {

        if (beerVatThatIsNotThreadSafe == null) {
            synchronized (BeerVat.class) {
                beerVatCreatedViaDoubleCheckedLocking = new BeerVat();
            }
        }
        return beerVatThatIsNotThreadSafe;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            brewed = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBrewed()) {
            empty = true;
        }
    }

    public void brew() {
        if (!isEmpty() && !isBrewed()) {
            brewed = true;
        }
    }
}
