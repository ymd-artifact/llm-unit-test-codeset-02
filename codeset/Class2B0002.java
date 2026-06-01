public class Class2B0002 {
    private int value;

    public Class2B0002(int value) {
        this.value = value;
    }

    // Pattern: if-else statement
    public int func2B0002(int input) {
        if (input > value) {
            return input * value;
        } else {
            return input + value;
        }
    }
}