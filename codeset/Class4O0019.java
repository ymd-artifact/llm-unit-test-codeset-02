import javax.xml.parsers.DocumentBuilderFactory;

public class Class4O0019 {
    private final DocumentBuilderFactory documentBuilderFactory;

    public Class4O0019(DocumentBuilderFactory documentBuilderFactory) {
        this.documentBuilderFactory = documentBuilderFactory;
    }

    public String func4O0019() {
        try {
            String factoryType = documentBuilderFactory != null ? documentBuilderFactory.getClass().getSimpleName() : "null";
            String factoryName = documentBuilderFactory != null ? documentBuilderFactory.getClass().getName() : "null";

            return "DocumentBuilderFactory: " + factoryType + ", FullName: " + factoryName;
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}