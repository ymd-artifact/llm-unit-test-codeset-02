public class Class2C0000 {
    private int value;

    public Class2C0000(int value) {
        this.value = value;
    }

    // Pattern: while loop
    public int func2C0000(int input) {
        int result = 0;
        int count = 0;

        while (count < value) {
            result += input;
            count++;
        }

        return result;
    }
}