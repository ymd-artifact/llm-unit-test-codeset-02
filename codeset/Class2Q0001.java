public class Class2Q0001 {
    private String value1;
    private String value2;
    private String value3;

    public Class2Q0001(String value1, String value2, String value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public String func2Q0001(String input) {
        StringBuilder result = new StringBuilder(input);
        if (input.contains(value1) && input.contains(value2) && input.contains(value3)) {
            result.append("Y");
        } else {
            result.append("Z");
        }
        return result.toString();
    }
}