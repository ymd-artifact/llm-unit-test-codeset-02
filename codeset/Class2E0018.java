/**
 * This class demonstrates the use of nested classes including
 * non-static inner class
 */
public class Class2E0018 {
    private final A inner = new A();

    /**
     * Inner class that contains a field
     */
    class A {
        int b = 200;
    }

    /**
     * Main method that demonstrates nested class usage
     * @return integer value from nested class field
     */
    public int func2E0018() {
        return inner.b;
    }
}