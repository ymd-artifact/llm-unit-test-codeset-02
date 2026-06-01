public class Class3B0009Ex {
    private int value;

    private Class3B0009Ex(int value) {
        this.value = value;
    }

    private int multiply(int input) {
        return input * value;
    }

    private void setValue(int newValue) {
        this.value = newValue;
    }
}