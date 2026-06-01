/**
 * Logical AND operator implementation
 */
public class Class3A0031 {
    public Boolean func3A0031(Integer a, Integer b) {
        if (a == null || b == null) {
            return Boolean.FALSE;
        }
        // Logical AND: returns true only if both operands are non-zero
        return (a != 0 && b != 0);
    }
}
