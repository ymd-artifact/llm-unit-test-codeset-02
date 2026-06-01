/**
 * This class demonstrates the use of nested classes including
 * non-static inner class with transient field
 */
public class Class2E0024 {
    private final A inner = new A();

    /**
     * Inner class that contains a field
     */
    class A {
        transient int b = 200;
    }

    /**
     * Main method that demonstrates nested class usage
     * @return integer value from nested class field
     */
    public int func2E0024() {
        return inner.b;
    }
}