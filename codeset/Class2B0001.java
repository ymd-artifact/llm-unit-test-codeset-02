public class Class2B0001 {
    private int value;

    public Class2B0001(int value) {
        this.value = value;
    }

    // Pattern: if-else if-else statement
    public int func2B0001(int input) {
        if (input > value) {
            return input * value;
        } else if (input < value) {
            return input + value;
        } else {
            return value;
        }
    }
}