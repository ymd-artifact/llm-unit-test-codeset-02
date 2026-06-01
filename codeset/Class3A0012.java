/**
 * Addition assignment operator implementation
 */
public class Class3A0012 {
    public Integer func3A0012(Integer a, Integer b) {
        if (a == null || b == null) {
            return Integer.MAX_VALUE;
        }
        a += b;  // 直接aに対して演算
        return a;
    }
}
