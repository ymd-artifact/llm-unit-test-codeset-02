/**
 * This class demonstrates the use of nested classes including
 * non-static inner class with public method
 */
public class Class2E0059 {
    /**
     * Inner class that contains a field and method
     */
    private class A {
        public int b = 200;

        /**
         * Additional method that returns a calculated value
         * @return calculated integer value
         */
        public int b() {
            // Return calculated value
            return b + 50;
        }
    }

    /**
     * Main method that demonstrates nested class usage
     * @return integer value from inner class method
     */
    public int func2E0059() {
        A inner = new A();

        return inner.b();
    }
}