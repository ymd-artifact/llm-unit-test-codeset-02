import java.util.function.IntUnaryOperator;

public class Class3B0005 {
    private int value;

    public Class3B0005(int value) {
        this.value = value;
    }

    // Pattern: lambda expression (single expression)
    public int func3B0005(int input) {
        IntUnaryOperator operation = x -> x * value;
        return operation.applyAsInt(input);
    }
}