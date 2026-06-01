public class Class1C0009 {
    private static int staticValue = 10;

    public static int func1C0009(final int input) {
        // Static method local class
        class Xyz {
            private int abc;

            public Xyz(int value) {
                this.abc = value;
            }

            public int calculate() {
                return input * abc + staticValue;
            }
        }

        Xyz calc = new Xyz(5);
        return calc.calculate();
    }
}