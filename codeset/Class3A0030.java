/**
 * Logical OR operator implementation
 */
public class Class3A0030 {
    public Boolean func3A0030(Integer a, Integer b) {
        if (a == null || b == null) {
            return Boolean.FALSE;
        }
        // Logical OR: returns true if either operand is non-zero
        return (a != 0 || b != 0);
    }
}
