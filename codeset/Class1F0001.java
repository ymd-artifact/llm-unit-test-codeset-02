/**
 * 値渡し（プリミティブ型）のメソッドパターン
 */
public class Class1F0001 {
    private int counter = 0;

    /**
     * 整数値を引数に取るメソッド
     * @param value 加算する値
     * @return カウンター値
     */
    public int func1F0001(int value) {
        counter += value;
        return counter;
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