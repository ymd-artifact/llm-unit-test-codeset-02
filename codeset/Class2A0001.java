public class Class2A0001 {
    private int value;

    public Class2A0001(int value) {
        this.value = value;
    }

    public int func2A0001(int input) {
        int result = 0;
        for (int i = 0; i < value; i++) {
            result += input;
        }
        return result;
    }
}