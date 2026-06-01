public class Class4A0018 {
    private Class4A0018Interface apiClient;
    private static final long DEFAULT_TIMEOUT_MS = 5000; // デフォルトタイムアウト：5秒

    public Class4A0018(Class4A0018Interface apiClient) {
        this.apiClient = apiClient;
    }

    // Pattern: 非同期メソッドのMock：タイムアウトあり
    public String func4A0018(String endpoint)
            throws java.util.concurrent.TimeoutException,
                   java.util.concurrent.ExecutionException,
                   InterruptedException {
        return apiClient.fetchDataWithTimeout(endpoint)
            .get(DEFAULT_TIMEOUT_MS, java.util.concurrent.TimeUnit.MILLISECONDS);
    }
}

interface Class4A0018Interface {
    java.util.concurrent.CompletableFuture<String> fetchDataWithTimeout(String endpoint);
}