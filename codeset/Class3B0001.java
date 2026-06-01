public class Class3B0001 {
    private int value;
    private int lastResult;

    public Class3B0001(int value) {
        this.value = value;
        this.lastResult = 0;
    }

    // Pattern: try-catch-finally
    public int func3B0001(int input) {
        try {
            return value / input;  // Potential division by zero
        } catch (ArithmeticException e) {
            return -1;  // Return -1 on division by zero
        } finally {
            lastResult = value * input;  // Always executed
        }
    }

    public int getLastResult() {
        return lastResult;
    }
}