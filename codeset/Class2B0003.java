public class Class2B0003 {
    private int value;

    public Class2B0003(int value) {
        this.value = value;
    }

    // Pattern: switch-case-default statement
    public int func2B0003(int input) {
        // Compare input relative to value and convert to cases
        int comparison = Integer.compare(input, value);

        switch (comparison) {
            case 1:  // input > value
                return input * value;
            case -1: // input < value
                return input + value;
            default: // input == value
                return value;
        }
    }
}