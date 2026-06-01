public class Class4A0009 {
    private String secretKey;

    public Class4A0009(String secretKey) {
        this.secretKey = secretKey;
    }

    // Pattern: 非公開メソッドのMock
    public String func4A0009(String data) {
        return encrypt(data);
    }

    /**
     * データの暗号化を行う
     * 実際の実装では強力な暗号化アルゴリズムを使用
     */
    private String encrypt(String data) {
        // 実際の実装では、AESなどの暗号化アルゴリズムを使用
        return data + "_" + secretKey;
    }
}
