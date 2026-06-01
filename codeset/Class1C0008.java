public class Class1C0008 {
    private static int staticValue = 10;

    // Static nested class
    public static class Abc {
        private int xyz;

        public Abc(int value) {
            this.xyz = value;
        }

        public int func1C0008(int input) {
            return input * xyz + staticValue;
        }
    }

    public static Abc createAbc(int value) {
        return new Abc(value);
    }
}