/**
 * デフォルト引数の代替パターン（メソッドオーバーロード）
 */
public class Class1F0004 {
    private int multiplier = 1;
    private int addend = 0;
    private int counter = 0;

    /**
     * 引数なしのメソッド（すべてデフォルト値を使用）
     * @return カウンター値
     */
    public int func1F0004() {
        return func1F0004(multiplier);
    }

    /**
     * 乗数のみ指定するメソッド（加数はデフォルト値）
     * @param multiplier カウンターに掛ける値
     * @return 計算結果
     */
    public int func1F0004(int multiplier) {
        return func1F0004(multiplier, addend);
    }

    /**
     * すべての引数を指定するメソッド
     * @param multiplier カウンターに掛ける値
     * @param addend 加算する値
     * @return 計算結果
     */
    public int func1F0004(int multiplier, int addend) {
        counter++;
        return counter * multiplier + addend;
    }

    /**
     * カウンター値を取得
     * @return 現在のカウンター値
     */
    public int getCounter() {
        return counter;
    }

    /**
     * カウンターをリセット
     */
    public void resetCounter() {
        counter = 0;
    }
}