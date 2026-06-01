public class Class2O0000 {
    private String value;

    public Class2O0000(String value) {
        this.value = value;
    }

    public String func2O0000(String input) {
        StringBuilder result = new StringBuilder(input);
        for (int i = 0; i < value.length(); i++) {
            for (int j = 0; j < value.length(); j++) {
                result.append('Z');
            }
        }
        return result.toString();
    }
}