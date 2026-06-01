public class Class2S0001 {
    private String value;

    public Class2S0001(String value) {
        this.value = value;
    }

    public String func2S0001(int input) {
        StringBuilder result = new StringBuilder(value);
        int i = 0;
        while (i < input) {
            int j = 0;
            while (j < input) {
                int k = 0;
                while (k < input) {
                    result.append('Z');
                    k++;
                }
                j++;
            }
            i++;
        }
        return result.toString();
    }
}