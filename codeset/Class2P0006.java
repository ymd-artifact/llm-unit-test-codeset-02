public class Class2P0006 {
    private String value;

    public Class2P0006(String value) {
        this.value = value;
    }

    public String func2P0006(String input) {
        StringBuilder result = new StringBuilder(input);
        if (input.length() > value.length()) {
            if (input.length() > value.length() + 2) {
                result.append("Z");
            }
            result.append("Y");
        }
        return result.toString();
    }
}