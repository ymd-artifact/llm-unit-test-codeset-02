/**
 * 可変長引数のメソッドパターン
 */
public class Class1F0003 {
    private int sum = 0;

    /**
     * 可変長引数を受け取るメソッド
     * @param values 合計する値の配列
     * @return 合計値
     */
    public int func1F0003(int... values) {
        if (values != null) {
            for (int value : values) {
                sum += value;
            }
        }
        return sum;
    }

    /**
     * 合計値を取得
     * @return 現在の合計値
     */
    public int getSum() {
        return sum;
    }

    /**
     * 合計値をリセット
     */
    public void resetSum() {
        sum = 0;
    }
}