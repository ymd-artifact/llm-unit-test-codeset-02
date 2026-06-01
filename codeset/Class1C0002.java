public class Class1C0002 implements Class1C0002Ex {
    private int value;

    public Class1C0002(int value) {
        this.value = value;
    }

    @Override
    public int func1C0002(int input) {
        return input * value;
    }

    @Override
    public int getValue() {
        return value;
    }
}