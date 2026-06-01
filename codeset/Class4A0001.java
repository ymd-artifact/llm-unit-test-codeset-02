public class Class4A0001 {
    private final String apiKey;
    private final String apiEndpoint;

    public Class4A0001(String apiKey, String apiEndpoint) {
        this.apiKey = apiKey;
        this.apiEndpoint = apiEndpoint;
    }

    // Pattern: 部分Mock
    // このメソッドは実際のビジネスロジックを含むため、実際の実装を使用
    public double func4A0001(double amount) {
        // 為替レートを取得して通貨換算を行う
        double exchangeRate = fetchExchangeRate("USD", "JPY");
        return calculateConvertedAmount(amount, exchangeRate);
    }

    // このメソッドは外部APIを呼び出すため、テスト時にMockする必要がある
    protected double fetchExchangeRate(String fromCurrency, String toCurrency) {
        // 実際の実装では外部為替APIを呼び出す
        // 本番環境では実際のAPIクライアントを使用
        String url = String.format("%s/exchange-rates?from=%s&to=%s&key=%s",
                                 apiEndpoint, fromCurrency, toCurrency, apiKey);

        // 注: この実装は例示用。実際にはHTTPクライアントを使用してAPIを呼び出す
        throw new UnsupportedOperationException(
            "This method should be mocked in tests. Real implementation would call: " + url);
    }

    // このメソッドは純粋な計算ロジックなので、実際の実装を使用
    protected double calculateConvertedAmount(double amount, double exchangeRate) {
        // 換算金額を計算（手数料1%を追加）
        double fee = amount * 0.01;
        return (amount + fee) * exchangeRate;
    }
}