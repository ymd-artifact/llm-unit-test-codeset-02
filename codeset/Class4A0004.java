public class Class4A0004 {
    private Class4A0004Interface productService;

    public Class4A0004(Class4A0004Interface productService) {
        this.productService = productService;
    }

    // Pattern: 引数を使ったメソッドのMock：引数あり(複数、型違い)
    public double func4A0004(String productId, int quantity, boolean isInternational) {
        // 商品の価格を計算（商品ID、数量、国際配送の有無に基づく）
        return productService.calculatePrice(productId, quantity, isInternational);
    }
}

interface Class4A0004Interface {
    /**
     * 商品の合計価格を計算
     * @param productId 商品ID（例：PROD-001, BOOK-123）
     * @param quantity 数量（1以上の整数）
     * @param isInternational 国際配送かどうか（true: 国際配送料金適用）
     * @return 合計価格（税・送料込み）
     * @throws IllegalArgumentException 商品が存在しない場合や数量が0以下の場合
     */
    double calculatePrice(String productId, int quantity, boolean isInternational);
}