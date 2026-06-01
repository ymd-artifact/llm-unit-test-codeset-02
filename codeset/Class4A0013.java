public class Class4A0013 {
    private Class4A0013Interface counter;

    public Class4A0013(Class4A0013Interface counter) {
        this.counter = counter;
    }

    // Pattern: 複数の戻り値を順に返すMock
    public int func4A0013() {
        // 2つの値を合計する（順番に1,2が返ることを期待）
        return counter.getNextValue() +  // 1
               counter.getNextValue();   // 2
        // 期待する合計値は3
    }
}

interface Class4A0013Interface {
    int getNextValue();
}