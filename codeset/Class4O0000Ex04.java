public class Class4O0000Ex04 {
    private String text;

    public Class4O0000Ex04(String text) {
        this.text = text;
    }

    public String method4O0000Ex04() {
        return text.substring(0, Math.min(text.length(), 10));
    }
}