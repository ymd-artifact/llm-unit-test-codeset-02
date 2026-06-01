import java.util.function.IntBinaryOperator;

public class Class3B0008 {
    private int value;

    public Class3B0008(int value) {
        assert value > 0 : "Value must be positive";
        this.value = value;
    }

    // Pattern: assert
    public int func3B0008(int input) {
        // Pre-condition
        assert input != 0 : "Input cannot be zero";

        int result = value / input;

        // Post-condition
        assert result * input == value : "Division result is incorrect";

        return result;
    }

    // Helper method with assertion
    public void setValue(int newValue) {
        assert newValue > 0 : "New value must be positive";
        this.value = newValue;
    }
}