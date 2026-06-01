public class Class4A0007 {
    private Class4A0007Interface notificationService;

    public Class4A0007(Class4A0007Interface notificationService) {
        this.notificationService = notificationService;
    }

    // Pattern: VoidメソッドのMock
    public void func4A0007(String message) {
        // メッセージの検証
        if (message == null || message.trim().isEmpty()) {
            throw new IllegalArgumentException("Message cannot be null or empty");
        }

        // 通知を送信（複数のチャネルに対して）
        notificationService.sendEmailNotification(message);  // メール通知
        notificationService.sendSlackNotification(message);  // Slack通知
        notificationService.sendLineNotification(message);   // LINE通知

        // 監査ログを記録
        notificationService.logNotification(message, "ALL_CHANNELS");
    }
}

interface Class4A0007Interface {
    /**
     * メール通知を送信
     * @param message 通知メッセージ
     * @throws IllegalStateException メールサーバーに接続できない場合
     */
    void sendEmailNotification(String message);

    /**
     * Slack通知を送信
     * @param message 通知メッセージ
     * @throws IllegalStateException Slackに接続できない場合
     */
    void sendSlackNotification(String message);

    /**
     * LINE通知を送信
     * @param message 通知メッセージ
     * @throws IllegalStateException LINEに接続できない場合
     */
    void sendLineNotification(String message);

    /**
     * 通知の監査ログを記録
     * @param message 通知メッセージ
     * @param channel 通知チャネル
     */
    void logNotification(String message, String channel);
}