public class Class2S0002 {
    private String value;

    public Class2S0002(String value) {
        this.value = value;
    }

    public String func2S0002(int input) {
        StringBuilder result = new StringBuilder(value);
        int i = 0;
        while (i < input) {
            int j = 0;
            while (j < input) {
                int k = 0;
                while (k < input) {
                    int l = 0;
                    while (l < input) {
                        int m = 0;
                        while (m < input) {
                            result.append('Z');
                            m++;
                        }
                        l++;
                    }
                    k++;
                }
                j++;
            }
            i++;
        }
        return result.toString();
    }
}