public class Class2R0002 {
    private String value;

    public Class2R0002(String value) {
        this.value = value;
    }

    public String func2R0002(int input) {
        StringBuilder result = new StringBuilder(value);
        switch (input) {
            case 0:
                result.append("U");
                break;
            case 1:
                result.append("V");
                break;
            case 2:
                result.append("W");
                break;
            case 3:
                result.append("X");
                break;
            case 4:
                result.append("Y");
                break;
            default:
                result.append("Z");
                break;
        }
        return result.toString();
    }
}