public class Class2P0002 {
    private String value;

    public Class2P0002(String value) {
        this.value = value;
    }

    public String func2P0002(String input) {
        StringBuilder result = new StringBuilder(input);
        if (input.length() > value.length()) {
            result.append("V");
        }
        if (input.length() > value.length() + 2) {
            result.append("W");
        }
        if (input.length() > value.length() + 4) {
            result.append("X");
        }
        if (input.length() > value.length() + 6) {
            result.append("Y");
        }
        if (input.length() > value.length() + 8) {
            result.append("Z");
        }
        return result.toString();
    }
}