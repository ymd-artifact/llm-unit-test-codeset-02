/**
 * Conditional operator implementation
 */
public class Class3A0035 {
    public Integer func3A0035(Boolean condition, Integer trueValue, Integer falseValue) {
        if (condition == null || trueValue == null || falseValue == null) {
            return Integer.MAX_VALUE;
        }
        return condition ? trueValue : falseValue;
    }
}
