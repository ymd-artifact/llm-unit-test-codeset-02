/**
 * Class demonstrating method without return value for unit testing
 */
public class Class1G0000 {
    private String message = "";

    /**
     * Method without return value: stores a message
     *
     * @param input message to store
     */
    public void func1G0000(String input) {
        if (input != null) {
            this.message = input;
        }
    }

    /**
     * Helper method to get stored message for testing
     *
     * @return stored message
     */
    public String getMessage() {
        return message;
    }
}