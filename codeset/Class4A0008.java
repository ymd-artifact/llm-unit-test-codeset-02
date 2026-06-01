public class Class4A0008 {
    // Pattern: 静的メソッドのMock
    public int func4A0008(int value) {
        // 静的メソッドを使用して値を計算
        return Class4A0008Other.multiply(value);
    }
}

class Class4A0008Other {
    /**
     * システム設定に基づいて値を計算
     * 実際の実装では設定ファイルやシステムプロパティから乗数を取得
     */
    public static int multiply(int value) {
        // 実際の実装ではシステム設定から乗数を取得
        return value * 4;
    }
}