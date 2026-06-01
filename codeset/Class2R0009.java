public class Class2R0009 {
    private String value;

    public Class2R0009(String value) {
        this.value = value;
    }

    public String func2R0009(int input1, int input2, int input3, int input4, int input5, int input6, int input7, int input8) {
        StringBuilder result = new StringBuilder(value);
        switch (input1) {
            case 0:
                switch (input2) {
                    case 0:
                        switch (input3) {
                            case 0:
                                switch (input4) {
                                    case 0:
                                        switch (input5) {
                                            case 0:
                                                switch (input6) {
                                                    case 0:
                                                        switch (input7) {
                                                            case 0:
                                                                switch (input8) {
                                                                    case 0:
                                                                        result.append("J");
                                                                        break;
                                                                    case 1:
                                                                        result.append("K");
                                                                        break;
                                                                    default:
                                                                        result.append("L");
                                                                        break;
                                                                }
                                                                break;
                                                            case 1:
                                                                result.append("M");
                                                                break;
                                                            default:
                                                                result.append("N");
                                                                break;
                                                        }
                                                        break;
                                                    case 1:
                                                        result.append("O");
                                                        break;
                                                    default:
                                                        result.append("P");
                                                        break;
                                                }
                                                break;
                                            case 1:
                                                result.append("Q");
                                                break;
                                            default:
                                                result.append("R");
                                                break;
                                        }
                                        break;
                                    case 1:
                                        result.append("S");
                                        break;
                                    default:
                                        result.append("T");
                                        break;
                                }
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