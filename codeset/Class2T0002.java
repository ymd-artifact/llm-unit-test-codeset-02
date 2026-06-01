public class Class2T0002 {
    private String value;

    public Class2T0002(String value) {
        this.value = value;
    }

    @SuppressWarnings("unreachable")
    public String func2T0002(String input) {
        StringBuilder result = new StringBuilder(input);
        for (int i = 0; i < value.length(); i++) {
            if (i % 2 == 0) {
                result.append('U');
                continue;
            }
            if (i % 3 == 0) {
                result.append('V');
                continue;
            }
            if (i % 5 == 0) {
                result.append('W');
                continue;
            }
            if (i % 7 == 0) {
                result.append('X');
                continue;
            }
            if (i % 11 == 0) {
                result.append('Y');
                continue;
            }
            result.append('Z');
        }
        return result.toString();
    }
}