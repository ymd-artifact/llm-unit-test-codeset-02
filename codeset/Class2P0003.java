public class Class2P0003 {
    private String value;

    public Class2P0003(String value) {
        this.value = value;
    }

    public String func2P0003(String input) {
        StringBuilder result = new StringBuilder(input);
        if (input.length() > value.length()) {
            result.append("S");
        }
        if (input.length() > value.length() + 2) {
            result.append("T");
        }
        if (input.length() > value.length() + 4) {
            result.append("U");
        }
        if (input.length() > value.length() + 6) {
            result.append("V");
        }
        if (input.length() > value.length() + 8) {
            result.append("W");
        }
        if (input.length() > value.length() + 10) {
            result.append("X");
        }
        if (input.length() > value.length() + 12) {
            result.append("Y");
        }
        if (input.length() > value.length() + 14) {
            result.append("Z");
        }
        return result.toString();
    }
}