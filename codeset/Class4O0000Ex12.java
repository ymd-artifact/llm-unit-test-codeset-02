public class Class4O0000Ex12 {
    private String text;

    public Class4O0000Ex12(String text) {
        this.text = text;
    }

    public String method4O0000Ex12() {
        return text.chars().distinct().count() + " unique characters";
    }
}