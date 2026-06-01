public class Class2Q0000 {
    private String value1;
    private String value2;

    public Class2Q0000(String value1, String value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public String func2Q0000(String input) {
        StringBuilder result = new StringBuilder(input);
        if (input.contains(value1) && input.contains(value2)) {
            result.append("Y");
        } else {
            result.append("Z");
        }
        return result.toString();
    }
}