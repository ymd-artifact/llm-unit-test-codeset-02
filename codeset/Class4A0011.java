public class Class4A0011 {
    private Class4A0011Interface dataProcessor;

    public Class4A0011(Class4A0011Interface dataProcessor) {
        this.dataProcessor = dataProcessor;
    }

    // Pattern: デフォルトメソッドのMock
    public String func4A0011(String data) {
        return dataProcessor.preProcess(data);
    }
}

interface Class4A0011Interface {
    // デフォルトメソッド：データの処理を行う
    default String preProcess(String data) {
        return "[Processed] " + data.trim().toUpperCase();
    }
}