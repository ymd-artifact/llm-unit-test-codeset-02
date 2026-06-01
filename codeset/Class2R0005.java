public class Class2R0005 {
    private String value;

    public Class2R0005(String value) {
        this.value = value;
    }

    public String func2R0005(int input) {
        StringBuilder result = new StringBuilder(value);
        switch (input) {
            case 0:
                result.append("E");
                break;
            case 1:
                result.append("F");
                break;
            case 2:
                result.append("G");
                break;
            case 3:
                result.append("H");
                break;
            case 4:
                result.append("I");
                break;
            case 5:
                result.append("J");
                break;
            case 6:
                result.append("K");
                break;
            case 7:
                result.append("L");
                break;
            case 8:
                result.append("M");
                break;
            case 9:
                result.append("N");
                break;
            case 10:
                result.append("O");
                break;
            case 11:
                result.append("P");
                break;
            case 12:
                result.append("Q");
                break;
            case 13:
                result.append("R");
                break;
            case 14:
                result.append("S");
                break;
            case 15:
                result.append("T");
                break;
            case 16:
                result.append("U");
                break;
            case 17:
                result.append("V");
                break;
            case 18:
                result.append("W");
                break;
            case 19:
                result.append("X");
                break;
            case 20:
                result.append("Y");
                break;
            default:
                result.append("Z");
                break;
        }
        return result.toString();
    }
}