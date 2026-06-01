public class Class3B0003 {
    private int value;

    public Class3B0003(int value) {
        this.value = value;
    }

    // Pattern: throws
    public int func3B0003(int input) throws ArithmeticException, IllegalArgumentException {
        if (input < 0) {
            throw new IllegalArgumentException("Input cannot be negative");
        }
        if (input == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return value / input;
    }
}