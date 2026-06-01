public class Class2P0015 {
    private String value;

    public Class2P0015(String value) {
        this.value = value;
    }

    public String func2P0015(String input) {
        StringBuilder result = new StringBuilder(input);
        if (input.length() > value.length() + 40) {
            result.append("F");
        } else if (input.length() > value.length() + 38) {
            result.append("G");
        } else if (input.length() > value.length() + 36) {
            result.append("H");
        } else if (input.length() > value.length() + 34) {
            result.append("I");
        } else if (input.length() > value.length() + 32) {
            result.append("J");
        } else if (input.length() > value.length() + 30) {
            result.append("K");
        } else if (input.length() > value.length() + 28) {
            result.append("L");
        } else if (input.length() > value.length() + 26) {
            result.append("M");
        } else if (input.length() > value.length() + 24) {
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