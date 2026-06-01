/**
 * This class demonstrates the use of nested classes including
 * non-static inner class with final field
 */
public class Class2E0022 {
    private final A inner = new A();

    /**
     * Inner class that contains a field
     */
    class A {
        final int b = 200;
    }

    /**
     * Main method that demonstrates nested class usage
     * @return integer value from nested class field
     */
    public int func2E0022() {
        return inner.b;
    }
}