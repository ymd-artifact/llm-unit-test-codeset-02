public class Class2P0012 {
    private String value;

    public Class2P0012(String value) {
        this.value = value;
    }

    public String func2P0012(String input) {
        StringBuilder result = new StringBuilder(input);
        if (input.length() > value.length() + 8) {
            result.append("Y");
        } else if (input.length() > value.length() + 6) {
            result.append("X");
        } else if (input.length() > value.length() + 4) {
            result.append("W");
        } else if (input.length() > value.length() + 2) {
            result.append("V");
        } else {
            result.append("Z");
        }
        return result.toString();
    }
}