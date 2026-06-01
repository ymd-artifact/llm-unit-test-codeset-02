public class Class3A0020 {
    public Integer func3A0020(Integer a, Integer b) {
        if (a == null || b == null) {
            return Integer.MAX_VALUE;
        }
        if ((b & ~0x1F) != 0) {
            return 0;
        }
        a >>= b;
        return a;
    }
}
