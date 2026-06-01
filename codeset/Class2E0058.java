/**
 * This class demonstrates the use of nested classes including
 * non-static inner class with public field
 */
public class Class2E0058 {
    /**
     * Inner class that contains a field
     */
    private class A {
        public int b = 200;
    }

    /**
     * Main method that demonstrates nested class usage
     * @return integer value from nested class field
     */
    public int func2E0058() {
        A inner = new A();

        return inner.b;
    }
}