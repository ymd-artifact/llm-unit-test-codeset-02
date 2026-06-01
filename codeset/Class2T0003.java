public class Class2T0003 {
    private String value;

    public Class2T0003(String value) {
        this.value = value;
    }

    @SuppressWarnings("unreachable")
    public String func2T0003(String input) {
        StringBuilder result = new StringBuilder(input);
        for (int i = value.length(); i > 0; i--) {
            if (i % 7 == 0) {
                result.append('X');
                break;
            }
            if (i % 5 == 0) {
                result.append('Y');
                break;
            }
            result.append('Z');
        }
        return result.toString();
    }
}