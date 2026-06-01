/**
 * This class demonstrates the use of nested classes including
 * non-static inner class with private method
 */
public class Class2E0028 {
    private final A inner = new A();

    /**
     * Inner class that contains a field and method
     */
    class A {
        public int b = 200;

        /**
         * Additional method that returns a calculated value
         * @return calculated integer value
         */
        private int b() {
            // Return calculated value
            return b + 50;
        }
    }

    /**
     * Main method that demonstrates nested class usage
     * @return integer value from inner class method
     */
    public int func2E0028() {
        return inner.b();
    }
}