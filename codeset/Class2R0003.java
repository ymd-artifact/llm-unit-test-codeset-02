public class Class2R0003 {
    private String value;

    public Class2R0003(String value) {
        this.value = value;
    }

    public String func2R0003(int input) {
        StringBuilder result = new StringBuilder(value);
        switch (input) {
            case 0:
                result.append("R");
                break;
            case 1:
                result.append("S");
                break;
            case 2:
                result.append("T");
                break;
            case 3:
                result.append("U");
                break;
            case 4:
                result.append("V");
                break;
            case 5:
                result.append("W");
                break;
            case 6:
                result.append("X");
                break;
            case 7:
                result.append("Y");
                break;
            default:
                result.append("Z");
                break;
        }
        return result.toString();
    }
}