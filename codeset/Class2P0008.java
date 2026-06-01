public class Class2P0008 {
    private String value;

    public Class2P0008(String value) {
        this.value = value;
    }

    public String func2P0008(String input) {
        StringBuilder result = new StringBuilder(input);
        if (input.length() > value.length()) {
            if (input.length() > value.length() + 2) {
                if (input.length() > value.length() + 4) {
                    if (input.length() > value.length() + 6) {
                        if (input.length() > value.length() + 8) {
                            result.append("Z");
                        }
                        result.append("Y");
                    }
                    result.append("X");
                }
                result.append("W");
            }
            result.append("V");
        }
        return result.toString();
    }
}