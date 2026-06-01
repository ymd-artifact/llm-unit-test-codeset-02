public class Class2P0001 {
    private String value;

    public Class2P0001(String value) {
        this.value = value;
    }

    public String func2P0001(String input) {
        StringBuilder result = new StringBuilder(input);
        if (input.length() > value.length()) {
            result.append("X");
        }
        if (input.length() > value.length() + 2) {
            result.append("Y");
        }
        if (input.length() > value.length() + 4) {
            result.append("Z");
        }
        return result.toString();
    }
}