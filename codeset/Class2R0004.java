public class Class2R0004 {
    private String value;

    public Class2R0004(String value) {
        this.value = value;
    }

    public String func2R0004(int input) {
        StringBuilder result = new StringBuilder(value);
        switch (input) {
            case 0:
                result.append("M");
                break;
            case 1:
                result.append("N");
                break;
            case 2:
                result.append("O");
                break;
            case 3:
                result.append("P");
                break;
            case 4:
                result.append("Q");
                break;
            case 5:
                result.append("R");
                break;
            case 6:
                result.append("S");
                break;
            case 7:
                result.append("T");
                break;
            case 8:
                result.append("U");
                break;
            case 9:
                result.append("V");
                break;
            case 10:
                result.append("W");
                break;
            case 11:
                result.append("X");
                break;
            case 12:
                result.append("Y");
                break;
            default:
                result.append("Z");
                break;
        }
        return result.toString();
    }
}