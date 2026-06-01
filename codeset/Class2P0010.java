public class Class2P0010 {
    private String value;

    public Class2P0010(String value) {
        this.value = value;
    }

    public String func2P0010(String input) {
        StringBuilder result = new StringBuilder(input);
        if (input.length() > value.length()) {
            result.append("Y");
        } else {
            result.append("Z");
        }
        return result.toString();
    }
}