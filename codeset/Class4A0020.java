public class Class4A0020 {
    private Class4A0020Interface logger;
    private static final int MAX_RETRIES = 3;

    public Class4A0020(Class4A0020Interface logger) {
        this.logger = logger;
    }

    // Pattern: メソッドの呼び出し回数を検証
    public boolean func4A0020(String message) {
        // 開始ログ（必ず1回）
        logger.log("Start: " + message);

        // 処理の試行（最大3回）
        boolean success = false;
        int attempts = 0;
        while (!success && attempts < MAX_RETRIES) {
            attempts++;
            logger.log("Attempt " + attempts + ": " + message);
            success = processMessage(message);
        }

        // 終了ログ（成功時のみ1回）
        if (success) {
            logger.log("Success: " + message);
            return true;
        }

        // 失敗ログ（失敗時のみ1回）
        logger.log("Failed after " + attempts + " attempts: " + message);
        return false;
    }

    private boolean processMessage(String message) {
        // 実際の処理をシミュレート
        return message != null && !message.isEmpty();
    }
}

interface Class4A0020Interface {
    void log(String message);
}