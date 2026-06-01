public class Class2R0000 {
    private String value;

    public Class2R0000(String value) {
        this.value = value;
    }

    public String func2R0000(int input) {
        StringBuilder result = new StringBuilder(value);
        switch (input) {
            case 0:
                result.append("X");
                break;
            case 1:
                result.append("Y");
                break;
            default:
                result.append("Z");
                break;
        }
        return result.toString();
    }
}