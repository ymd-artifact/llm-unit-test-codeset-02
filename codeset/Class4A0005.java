public class Class4A0005 {
    private Class4A0005Interface passwordValidator;

    public Class4A0005(Class4A0005Interface passwordValidator) {
        this.passwordValidator = passwordValidator;
    }

    // Pattern: 引数マッチャーを使ったMock：単一
    public boolean func4A0005(String password) {
        // パスワードの複雑な検証ルール：
        // - 最小8文字以上
        // - 大文字を含む
        // - 数字を含む
        // - 特殊文字を含む
        // これらのルールは外部サービスで管理され、
        // テスト時には引数マッチャーを使用して様々なパターンをMockする
        return passwordValidator.isValidPassword(password);
    }
}

interface Class4A0005Interface {
    /**
     * パスワードが有効かどうかを検証
     * @param password 検証するパスワード
     * @return パスワードが有効な場合はtrue
     *
     * 検証ルール：
     * - null値は無効
     * - 8文字以上
     * - 少なくとも1つの大文字を含む
     * - 少なくとも1つの数字を含む
     * - 少なくとも1つの特殊文字を含む (!@#$%^&*()_+-=[]{}|;:,.<>?)
     */
    boolean isValidPassword(String password);
}