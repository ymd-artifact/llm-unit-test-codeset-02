public class Class4A0010 {
    private final Class4A0010Other connection;

    public Class4A0010(String connectionString) {
        // コンストラクタ内で直接インスタンス化（これをMockする必要がある）
        this.connection = new Class4A0010Other(connectionString);
    }

    // Pattern: コンストラクタのMock
    public boolean func4A0010(String query) {
        return connection.executeQuery(query);
    }
}

class Class4A0010Other {
    private final String connectionString;

    public Class4A0010Other(String connectionString) {
        this.connectionString = connectionString;
        // 実際の環境では、ここで接続を確立する
    }

    public boolean executeQuery(String query) {
        // 実際のクエリ実行処理
        return true;
    }
}