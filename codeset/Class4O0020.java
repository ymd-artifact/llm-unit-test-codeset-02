import org.xml.sax.SAXException;

public class Class4O0020 {
    private final SAXException saxException;

    public Class4O0020(SAXException saxException) {
        this.saxException = saxException;
    }

    public String func4O0020() {
        try {
            String exceptionType = saxException != null ? saxException.getClass().getSimpleName() : "null";
            String exceptionMessage = saxException != null ? saxException.getMessage() : "null";

            return "SAXException: " + exceptionType + ", Message: " + exceptionMessage;
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}