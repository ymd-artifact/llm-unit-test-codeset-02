public class Class2D0000 {
    private int value;

    public Class2D0000(int value) {
        this.value = value;
    }

    // Pattern: continue statement
    public int func2D0000(int input) {
        int result = 0;

        for (int i = 0; i < value; i++) {
            // Skip negative numbers in the sequence
            if ((input + i) < 0) {
                continue;
            }
            result += (input + i);
        }

        return result;
    }
}