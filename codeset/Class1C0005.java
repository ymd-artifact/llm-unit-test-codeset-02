public class Class1C0005 {
    private int outerValue;

    public Class1C0005(int value) {
        this.outerValue = value;
    }

    // Non-static inner class
    public class Xyz {
        private int abc;

        public Xyz(int value) {
            this.abc = value;
        }

        public int func1C0005(int input) {
            return input * abc + outerValue;
        }
    }

    public Xyz createXyz(int value) {
        return new Xyz(value);
    }
}