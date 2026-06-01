public class Class4A0000 {
    private Class4A0000Interface service;

    public Class4A0000(Class4A0000Interface service) {
        this.service = service;
    }

    // Pattern: 全Mock
    public String func4A0000(String data) {
        // このメソッドは必ずMockされる必要がある
        return service.process(data);
    }
}

interface Class4A0000Interface {
    String process(String data);
}