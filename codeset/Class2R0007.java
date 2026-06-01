public class Class2R0007 {
    private String value;

    public Class2R0007(String value) {
        this.value = value;
    }

    public String func2R0007(int input1, int input2, int input3) {
        StringBuilder result = new StringBuilder(value);
        switch (input1) {
            case 0:
                switch (input2) {
                    case 0:
                        switch (input3) {
                            case 0:
                                result.append("T");
                                break;
                            case 1:
                                result.append("U");
                                break;
                            default:
                                result.append("V");
                                break;
                        }
                        break;
                    case 1:
                        result.append("W");
                        break;
                    default:
                        result.append("X");
                        break;
                }
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