/**
 * Right shift operator implementation
 */
public class Class3A0033 {
    public Integer func3A0033(Integer a, Integer b) {
        if (a == null || b == null) {
            return Integer.MAX_VALUE;
        }
        // Check if shift count is valid (0-31)
        if ((b & ~0x1F) != 0) {
            return 0;  // Shift count too large
        }
        return a >> b;  // Using right shift operator
    }
}
