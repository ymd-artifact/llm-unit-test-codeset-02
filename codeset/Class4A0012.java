public class Class4A0012 {
    private Class4A0012Interface productRepository;

    public Class4A0012(Class4A0012Interface productRepository) {
        this.productRepository = productRepository;
    }

    // Pattern: リストやコレクションを返すMock
    public java.util.List<String> func4A0012(String category) {
        return productRepository.findProductNames(category);
    }
}

interface Class4A0012Interface {
    java.util.List<String> findProductNames(String category);
}