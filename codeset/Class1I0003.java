import java.util.Deque;
import java.util.ArrayDeque;

/**
 * Class demonstrating Deque operations for unit testing
 */
public class Class1I0003 {
    /**
     * Process a deque of strings by filtering out null values and strings shorter than minLength,
     * then convert remaining strings to uppercase. Maintains the original order.
     *
     * @param input deque of strings to process
     * @param minLength minimum length requirement for strings
     * @return processed deque of uppercase strings meeting the length requirement
     */
    public Deque<String> func1I0003(Deque<String> input, int minLength) {
        if (input == null) {
            return new ArrayDeque<>();
        }

        Deque<String> result = new ArrayDeque<>();
        while (!input.isEmpty()) {
            String str = input.pollFirst();
            if (str != null && str.length() >= minLength) {
                result.offerLast(str.toUpperCase());
            }
        }
        return result;
    }
}