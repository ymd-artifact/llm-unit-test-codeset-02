public class Class2S0003 {
    private String value;

    public Class2S0003(String value) {
        this.value = value;
    }

    public String func2S0003(int input) {
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
                            int n = 0;
                            while (n < input) {
                                int o = 0;
                                while (o < input) {
                                    int p = 0;
                                    while (p < input) {
                                        result.append('Z');
                                        p++;
                                    }
                                    o++;
                                }
                                n++;
                            }
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