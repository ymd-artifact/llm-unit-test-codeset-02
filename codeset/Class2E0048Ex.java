/**
 * This class provides an abstract method for Class2E0048
 */
public abstract class Class2E0048Ex {
    protected int a = 250;

    /**
     * Abstract method that returns a calculated value
     * @return calculated integer value
     */
    abstract int a();
}

class Class2E0048Ex2 extends Class2E0048Ex {
    int a() {
        return a + 50;
    }
}