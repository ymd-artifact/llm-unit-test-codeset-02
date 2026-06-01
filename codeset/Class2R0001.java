public class Class2R0001 {
    private String value;

    public Class2R0001(String value) {
        this.value = value;
    }

    public String func2R0001(int input) {
        StringBuilder result = new StringBuilder(value);
        switch (input) {
            case 0:
                result.append("W");
                break;
            case 1:
                result.append("X");
                break;
            case 2:
                result.append("Y");
                break;
            default:
                result.append("Z");
                break;
        }
        return result.toString();
    }
}