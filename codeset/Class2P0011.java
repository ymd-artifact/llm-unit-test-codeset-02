public class Class2P0011 {
    private String value;

    public Class2P0011(String value) {
        this.value = value;
    }

    public String func2P0011(String input) {
        StringBuilder result = new StringBuilder(input);
        if (input.length() > value.length()) {
            result.append("Y");
        } else if (input.length() < value.length()) {
            result.append("X");
        } else {
            result.append("Z");
        }
        return result.toString();
    }
}