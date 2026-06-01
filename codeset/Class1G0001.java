/**
 * Class demonstrating method with return value for unit testing
 */
public class Class1G0001 {
    /**
     * Method with return value: converts input to uppercase
     *
     * @param input string to convert
     * @return uppercase version of input, or empty string if input is null
     */
    public String func1G0001(String input) {
        if (input == null) {
            return "";
        }
        return input.toUpperCase();
    }
}