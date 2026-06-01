public class Class2P0004 {
    private String value;

    public Class2P0004(String value) {
        this.value = value;
    }

    public String func2P0004(String input) {
        StringBuilder result = new StringBuilder(input);
        if (input.length() > value.length()) {
            result.append("N");
        }
        if (input.length() > value.length() + 2) {
            result.append("O");
        }
        if (input.length() > value.length() + 4) {
            result.append("P");
        }
        if (input.length() > value.length() + 6) {
            result.append("Q");
        }
        if (input.length() > value.length() + 8) {
            result.append("R");
        }
        if (input.length() > value.length() + 10) {
            result.append("S");
        }
        if (input.length() > value.length() + 12) {
            result.append("T");
        }
        if (input.length() > value.length() + 14) {
            result.append("U");
        }
        if (input.length() > value.length() + 16) {
            result.append("V");
        }
        if (input.length() > value.length() + 18) {
            result.append("W");
        }
        if (input.length() > value.length() + 20) {
            result.append("X");
        }
        if (input.length() > value.length() + 22) {
            result.append("Y");
        }
        if (input.length() > value.length() + 24) {
            result.append("Z");
        }
        return result.toString();
    }
}