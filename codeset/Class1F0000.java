/**
 * 引数なしのメソッドパターン
 */
public class Class1F0000 {
    private int counter = 0;

    /**
     * 引数なしのメソッド
     * @return カウンター値
     */
    public int func1F0000() {
        counter++;
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