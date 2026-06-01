/**
 * This class demonstrates the use of nested classes including
 * non-static inner class with static method
 */
public class Class2E0030 {
    private final A inner = new A();

    /**
     * Inner class that contains a field and method
     */
    static class A {
        public int b = 200;

        /**
         * Additional method that returns a calculated value
         * @return calculated integer value
         */
        static int b() {
            // Return calculated value
            return 250;
        }
    }

    /**
     * Main method that demonstrates nested class usage
     * @return integer value from inner class method
     */
    public int func2E0030() {
        return inner.b();
    }
}