public class Class1C0007 {
    private int value;

    public Class1C0007(int value) {
        this.value = value;
    }

    public int func1C0007(int input) {
        Class1C0007Ex op = new Class1C0007Ex() {
            @Override
            public int calculate(int x) {
                return x * value;
            }
        };
        return op.calculate(input);
    }
}