/**
 * This class demonstrates the use of nested classes including
 * non-static inner class with protected field
 */
public class Class2E0021 {
    private final A inner = new A();

    /**
     * Inner class that contains a field
     */
    class A {
        protected int b = 200;
    }

    /**
     * Main method that demonstrates nested class usage
     * @return integer value from nested class field
     */
    public int func2E0021() {
        return inner.b;
    }
}