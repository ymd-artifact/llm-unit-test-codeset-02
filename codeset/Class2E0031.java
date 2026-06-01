/**
 * This class demonstrates the use of nested classes including
 * non-static inner class with abstract method
 */
public class Class2E0031 {
    private final B inner = new B();

    /**
     * Abstract inner class that contains a field and method
     */
    abstract class A {
        public int b = 200;

        /**
         * Abstract method that returns a calculated value
         * @return calculated integer value
         */
        abstract int c();
    }

    class B extends A {
        int c() {
            return b + 50;
        }
    }

    /**
     * Main method that demonstrates nested class usage
     * @return integer value from inner class method
     */
    public int func2E0031() {
        return inner.c();
    }
}