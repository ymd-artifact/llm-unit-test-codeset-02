public class Class2O0001 {
    private String value;

    public Class2O0001(String value) {
        this.value = value;
    }

    public String func2O0001(String input) {
        StringBuilder result = new StringBuilder(input);
        for (int i = 0; i < value.length(); i++) {
            for (int j = 0; j < value.length(); j++) {
                for (int k = 0; k < value.length(); k++) {
                    result.append('Z');
                }
            }
        }
        return result.toString();
    }
}