public class Class3B0002 {
    private int value;

    public Class3B0002(int value) {
        this.value = value;
    }

    // Pattern: throw
    public int func3B0002(int input) {
        if (input == 0) {
            throw new IllegalArgumentException("Input cannot be zero");
        }
        if (input < 0) {
            throw new IllegalArgumentException("Input cannot be negative");
        }
        return value / input;
    }
}