public class Class4A0015 {
    private Class4A0015Interface operation;

    public Class4A0015(Class4A0015Interface operation) {
        this.operation = operation;
    }

    // Pattern: 例外をスローするメソッドをMock：複数、順序指定
    public void func4A0015() throws Class4A0015Other_1, Class4A0015Other_2 {
        try {
            operation.execute();
        } catch (Class4A0015Other_1 e) {
            // 最初の例外をログに記録
            System.out.println("First error logged: " + e.getMessage());
            // 2番目の処理を実行
            operation.execute();  // 2回目の呼び出しで2番目の例外が発生することを期待
        }
    }
}

interface Class4A0015Interface {
    void execute() throws Class4A0015Other_1, Class4A0015Other_2;
}

class Class4A0015Other_1 extends Exception {
    public Class4A0015Other_1(String message) {
        super(message);
    }
}

class Class4A0015Other_2 extends Exception {
    public Class4A0015Other_2(String message) {
        super(message);
    }
}