public class Class2B0000 {
    private int value;

    public Class2B0000(int value) {
        this.value = value;
    }

    // Pattern: Single if statement
    public int func2B0000(int input) {
        if (input > value) {
            return input * value;
        }
        return input + value;
    }
}