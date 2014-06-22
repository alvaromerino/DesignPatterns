package singleton;

/**
 * SINGLETON: is a design pattern that restricts the instantiation of a class to one object.
 * This is useful when exactly one object is needed to coordinate actions across the system.
 * The concept is sometimes generalized to systems that operate more efficiently when only one object exists.
 */
public class MySingleton {

    private static MySingleton INSTANCE = null;

    private MySingleton() {}

    // synchronized method to avoid multithread problems.
    public synchronized static MySingleton getInstance() {

        if (INSTANCE == null) INSTANCE = new MySingleton();
        return INSTANCE;
    }

    // we should override clone() method to throw a exception,
    // because we must have a single instance (not clonable) to satisfy the pattern.
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

}
