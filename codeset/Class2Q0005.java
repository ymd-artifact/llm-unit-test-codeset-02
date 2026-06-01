public class Class2Q0005 {
    private String value1;
    private String value2;
    private String value3;
    private String value4;
    private String value5;

    public Class2Q0005(String value1, String value2, String value3, String value4, String value5) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
        this.value4 = value4;
        this.value5 = value5;
    }

    public String func2Q0005(String input) {
        StringBuilder result = new StringBuilder(input);
        if (input.contains(value1) || input.contains(value2) || input.contains(value3) || input.contains(value4) || input.contains(value5)) {
            result.append("Y");
        } else {
            result.append("Z");
        }
        return result.toString();
    }
}