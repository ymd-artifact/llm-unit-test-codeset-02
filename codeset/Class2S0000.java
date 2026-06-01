public class Class2S0000 {
    private String value;

    public Class2S0000(String value) {
        this.value = value;
    }

    public String func2S0000(int input) {
        StringBuilder result = new StringBuilder(value);
        int i = 0;
        while (i < input) {
            int j = 0;
            while (j < input) {
                result.append('Z');
                j++;
            }
            i++;
        }
        return result.toString();
    }
}