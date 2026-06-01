public class Class2O0003 {
    private String value;

    public Class2O0003(String value) {
        this.value = value;
    }

    public String func2O0003(String input) {
        StringBuilder result = new StringBuilder(input);
        for (int i = 0; i < value.length(); i++) {
            for (int j = 0; j < value.length(); j++) {
                for (int k = 0; k < value.length(); k++) {
                    for (int l = 0; l < value.length(); l++) {
                        for (int m = 0; m < value.length(); m++) {
                            for (int n = 0; n < value.length(); n++) {
                                for (int o = 0; o < value.length(); o++) {
                                    for (int p = 0; p < value.length(); p++) {
                                        result.append('Z');
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return result.toString();
    }
}