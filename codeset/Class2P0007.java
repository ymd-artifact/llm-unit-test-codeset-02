public class Class2P0007 {
    private String value;

    public Class2P0007(String value) {
        this.value = value;
    }

    public String func2P0007(String input) {
        StringBuilder result = new StringBuilder(input);
        if (input.length() > value.length()) {
            if (input.length() > value.length() + 2) {
                if (input.length() > value.length() + 4) {
                    result.append("Z");
                }
                result.append("Y");
            }
            result.append("X");
        }
        return result.toString();
    }
}