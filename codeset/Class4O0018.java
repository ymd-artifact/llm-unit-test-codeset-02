import com.sun.org.apache.xerces.internal.parsers.DOMParser;

public class Class4O0018 {
    private final DOMParser domParser;

    public Class4O0018(DOMParser domParser) {
        this.domParser = domParser;
    }

    public String func4O0018() {
        try {
            String parserType = domParser != null ? domParser.getClass().getSimpleName() : "null";
            String parserName = domParser != null ? domParser.getClass().getName() : "null";

            return "DOMParser: " + parserType + ", FullName: " + parserName;
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}