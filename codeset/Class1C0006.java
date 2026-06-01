public class Class1C0006 {
    private int value;

    public Class1C0006(int value) {
        this.value = value;
    }

    public int func1C0006(final int input) {
        // Method-local class
        class Abc {
            private int xyz;

            public Abc(int val) {
                this.xyz = val;
            }

            public int calculate() {
                return input * xyz + value;
            }
        }

        Abc calc = new Abc(5);
        return calc.calculate();
    }
}