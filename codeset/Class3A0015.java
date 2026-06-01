public class Class3A0015 {
    public Integer func3A0015(Integer a, Integer b) {
        if (a == null || b == null || b == 0) {
            return Integer.MAX_VALUE;
        }
        a /= b;
        return a;
    }
}
