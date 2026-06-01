/**
 * This class demonstrates the use of nested classes including
 * non-static inner class with static field
 */
public class Class2E0023 {
    private final A inner = new A();

    /**
     * Inner class that contains a field
     */
    static class A {
        static int b = 200;
    }

    /**
     * Main method that demonstrates nested class usage
     * @return integer value from nested class field
     */
    public int func2E0023() {
        return inner.b;
    }
}