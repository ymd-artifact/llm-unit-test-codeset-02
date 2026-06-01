public class Class3A0004 {
    public Integer func3A0004(Integer a, Integer b) {
        if (a == null || b == null || b == 0) {
            return Integer.MAX_VALUE;
        }
        Integer result = a % b;
        return result;
    }
}
