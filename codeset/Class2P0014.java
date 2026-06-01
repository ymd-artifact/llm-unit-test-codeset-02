public class Class2P0014 {
    private String value;

    public Class2P0014(String value) {
        this.value = value;
    }

    public String func2P0014(String input) {
        StringBuilder result = new StringBuilder(input);
        if (input.length() > value.length() + 24) {
            result.append("N");
        } else if (input.length() > value.length() + 22) {
            result.append("O");
        } else if (input.length() > value.length() + 20) {
            result.append("P");
        } else if (input.length() > value.length() + 18) {
            result.append("Q");
        } else if (input.length() > value.length() + 16) {
            result.append("R");
        } else if (input.length() > value.length() + 14) {
            result.append("S");
        } else if (input.length() > value.length() + 12) {
            result.append("T");
        } else if (input.length() > value.length() + 10) {
            result.append("U");
        } else if (input.length() > value.length() + 8) {
            result.append("V");
        } else if (input.length() > value.length() + 6) {
            result.append("W");
        } else if (input.length() > value.length() + 4) {
            result.append("X");
        } else if (input.length() > value.length() + 2) {
            result.append("Y");
        } else {
            result.append("Z");
        }
        return result.toString();
    }
}