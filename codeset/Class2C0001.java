public class Class2C0001 {
    private int value;

    public Class2C0001(int value) {
        this.value = value;
    }

    // Pattern: do-while loop
    public int func2C0001(int input) {
        int result = 0;
        int count = 0;

        do {
            result += input;
            count++;
        } while (count < value);

        return result;
    }
}