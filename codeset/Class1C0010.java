public enum Class1C0010 {
    MULTIPLY(2) {
        @Override
        public int func1C0010(int input) {
            return input * getValue();
        }
    },
    ADD(3) {
        @Override
        public int func1C0010(int input) {
            return input + getValue();
        }
    },
    SUBTRACT(1) {
        @Override
        public int func1C0010(int input) {
            return input - getValue();
        }
    };

    private final int value;

    Class1C0010(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public abstract int func1C0010(int input);
}