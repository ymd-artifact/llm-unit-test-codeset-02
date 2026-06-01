import java.util.Queue;
import java.util.LinkedList;

/**
 * Class demonstrating Queue operations for unit testing
 */
public class Class1I0002 {
    /**
     * Process a queue of strings by filtering out null values and strings shorter than minLength,
     * then convert remaining strings to uppercase
     *
     * @param input queue of strings to process
     * @param minLength minimum length requirement for strings
     * @return processed queue of uppercase strings meeting the length requirement
     */
    public Queue<String> func1I0002(Queue<String> input, int minLength) {
        if (input == null) {
            return new LinkedList<>();
        }

        Queue<String> result = new LinkedList<>();
        while (!input.isEmpty()) {
            String str = input.poll();
            if (str != null && str.length() >= minLength) {
                result.offer(str.toUpperCase());
            }
        }
        return result;
    }
}