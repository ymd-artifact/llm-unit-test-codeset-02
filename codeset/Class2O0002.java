public class Class2O0002 {
    private String value;

    public Class2O0002(String value) {
        this.value = value;
    }

    public String func2O0002(String input) {
        StringBuilder result = new StringBuilder(input);
        for (int i = 0; i < value.length(); i++) {
            for (int j = 0; j < value.length(); j++) {
                for (int k = 0; k < value.length(); k++) {
                    for (int l = 0; l < value.length(); l++) {
                        for (int m = 0; m < value.length(); m++) {
                            result.append('Z');
                        }
                    }
                }
            }
        }
        return result.toString();
    }
}