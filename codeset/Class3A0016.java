public class Class3A0016 {
    public Integer func3A0016(Integer a, Integer b) {
        if (a == null || b == null || b == 0) {
            return Integer.MAX_VALUE;
        }
        a %= b;
        return a;
    }
}
