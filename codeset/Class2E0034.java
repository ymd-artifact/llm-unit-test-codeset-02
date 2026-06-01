/**
 * This class demonstrates the use of nested classes including
 * non-static inner class with default method
 */
public class Class2E0034 {
    private final A inner = new A();

    /**
     * Inner interface that contains a method
     */
    interface I {
        default int b() {
            return 250;
        }
    }

    /**
     * Inner class that implements the interface
     */
    class A implements I {
        public int b = 200;
    }

    /**
     * Main method that demonstrates nested class usage
     * @return integer value from inner class method
     */
    public int func2E0034() {
        return inner.b();
    }
}