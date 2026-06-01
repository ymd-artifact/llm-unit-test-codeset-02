public class Class2T0005 {
    private String value;

    public Class2T0005(String value) {
        this.value = value;
    }

    @SuppressWarnings("unreachable")
    public String func2T0005(String input) {
        StringBuilder result = new StringBuilder(input);
        for (int i = value.length(); i > 0; i--) {
            if (i % 19 == 0) {
                result.append('U');
                break;
            }
            if (i % 17 == 0) {
                result.append('V');
                break;
            }
            if (i % 13 == 0) {
                result.append('W');
                break;
            }
            if (i % 11 == 0) {
                result.append('X');
                break;
            }
            if (i % 7 == 0) {
                result.append('Y');
                break;
            }
            result.append('Z');
        }
        return result.toString();
    }
}