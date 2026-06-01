/**
 * Cast operator implementation
 */
public class Class3A0036 {
    public Integer func3A0036(Double value) {
        if (value == null) {
            return Integer.MAX_VALUE;
        }
        return (int)(double)value;  // キャスト演算子を使用して明示的に型変換
    }
}
