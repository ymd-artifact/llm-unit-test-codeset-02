public class Class4A0006 {
    private Class4A0006Interface emailBuilder;

    public Class4A0006(Class4A0006Interface emailBuilder) {
        this.emailBuilder = emailBuilder;
    }

    // Pattern: 引数マッチャーを使ったMock：複数、型違い
    public String func4A0006(int priority, String recipient, boolean isHtml) {
        // メール本文を生成（優先度、受信者、HTML形式に基づく）
        // 引数の検証ルール：
        // - priority: 1-5の範囲内（1:最高、5:最低）
        // - recipient: 有効なメールアドレス形式
        // - isHtml: true=HTML形式、false=プレーンテキスト
        return emailBuilder.buildEmailBody(priority, recipient, isHtml);
    }
}

interface Class4A0006Interface {
    /**
     * メール本文を生成
     * @param priority 優先度（1-5: 1=最高、5=最低）
     * @param recipient 受信者のメールアドレス
     * @param isHtml HTML形式で生成するかどうか
     * @return 生成されたメール本文
     * @throws IllegalArgumentException
     *         - priorityが1-5の範囲外
     *         - recipientが無効なメールアドレス形式
     */
    String buildEmailBody(int priority, String recipient, boolean isHtml);
}