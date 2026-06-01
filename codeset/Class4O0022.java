import org.w3c.dom.Document;

public class Class4O0022 {
    private final Document document;

    public Class4O0022(Document document) {
        this.document = document;
    }

    public String func4O0022() {
        try {
            String documentType = document != null ? document.getClass().getSimpleName() : "null";
            String documentName = document != null ? document.getClass().getName() : "null";
            String nodeType = document != null ? String.valueOf(document.getNodeType()) : "null";
            String documentElement = document != null && document.getDocumentElement() != null ?
                                   document.getDocumentElement().getTagName() : "null";

            return "Document: " + documentType + ", FullName: " + documentName +
                   ", NodeType: " + nodeType + ", RootElement: " + documentElement;
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}