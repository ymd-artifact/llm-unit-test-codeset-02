public class Class2D0001 {
    private int value;

    public Class2D0001(int value) {
        this.value = value;
    }

    // Pattern: break statement
    public int func2D0001(int input) {
        int result = 0;

        for (int i = 0; i < value; i++) {
            result += (input + i);

            // Stop if sum exceeds threshold
            if (result > value * input) {
                break;
            }
        }

        return result;
    }
}