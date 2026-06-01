public class Class2P0005 {
    private String value;

    public Class2P0005(String value) {
        this.value = value;
    }

    public String func2P0005(String input) {
        StringBuilder result = new StringBuilder(input);
        if (input.length() > value.length()) {
            result.append("F");
        }
        if (input.length() > value.length() + 2) {
            result.append("G");
        }
        if (input.length() > value.length() + 4) {
            result.append("H");
        }
        if (input.length() > value.length() + 6) {
            result.append("I");
        }
        if (input.length() > value.length() + 8) {
            result.append("J");
        }
        if (input.length() > value.length() + 10) {
            result.append("K");
        }
        if (input.length() > value.length() + 12) {
            result.append("L");
        }
        if (input.length() > value.length() + 14) {
            result.append("M");
        }
        if (input.length() > value.length() + 16) {
            result.append("N");
        }
        if (input.length() > value.length() + 18) {
            result.append("O");
        }
        if (input.length() > value.length() + 20) {
            result.append("P");
        }
        if (input.length() > value.length() + 22) {
            result.append("Q");
        }
        if (input.length() > value.length() + 24) {
            result.append("R");
        }
        if (input.length() > value.length() + 26) {
            result.append("S");
        }
        if (input.length() > value.length() + 28) {
            result.append("T");
        }
        if (input.length() > value.length() + 30) {
            result.append("U");
        }
        if (input.length() > value.length() + 32) {
            result.append("V");
        }
        if (input.length() > value.length() + 34) {
            result.append("W");
        }
        if (input.length() > value.length() + 36) {
            result.append("X");
        }
        if (input.length() > value.length() + 38) {
            result.append("Y");
        }
        if (input.length() > value.length() + 40) {
            result.append("Z");
        }
        return result.toString();
    }
}