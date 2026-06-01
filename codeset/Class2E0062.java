import util.MathUtil;

public class Class2E0062 {
    private int value;

    public Class2E0062(int value) {
        this.value = value;
    }

    // Pattern: Different package class method call
    public int func2E0062(int input) {
        int multiplied = MathUtil.multiply(input, value);
        int added = MathUtil.add(multiplied, value);
        return added;
    }
}