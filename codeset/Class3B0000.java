public class Class3B0000 {
    private int value;

    public Class3B0000(int value) {
        this.value = value;
    }

    // Pattern: try-catch
    public int func3B0000(int input) {
        try {
            return value / input;  // Potential division by zero
        } catch (ArithmeticException e) {
            return -1;  // Return -1 on division by zero
        }
    }
}