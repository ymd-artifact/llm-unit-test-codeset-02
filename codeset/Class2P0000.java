public class Class2P0000 {
    private String value;

    public Class2P0000(String value) {
        this.value = value;
    }

    public String func2P0000(String input) {
        StringBuilder result = new StringBuilder(input);
        if (input.length() > value.length()) {
            result.append("Y");
        }
        if (input.length() > value.length() + 2) {
            result.append("Z");
        }
        return result.toString();
    }
}