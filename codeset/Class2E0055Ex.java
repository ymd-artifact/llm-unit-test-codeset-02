/**
 * This class provides an abstract method for Class2E0055
 */
abstract class Class2E0055Ex {
    protected int a = 250;

    /**
     * Abstract method that returns a calculated value
     * @return calculated integer value
     */
    public abstract int a();
}

class Class2E0055Ex2 extends Class2E0055Ex {
    public int a() {
        return a + 50;
    }
}