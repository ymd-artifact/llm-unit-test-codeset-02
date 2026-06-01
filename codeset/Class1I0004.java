import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

/**
 * Class demonstrating Map operations for unit testing
 */
public class Class1I0004 {
    /**
     * Process a map of strings by filtering out entries with null values or values shorter than minLength,
     * then convert remaining values to uppercase
     *
     * @param input map of integer keys to string values to process
     * @param minLength minimum length requirement for string values
     * @return processed map with uppercase string values meeting the length requirement
     */
    public Map<Integer, String> func1I0004(Map<Integer, String> input, int minLength) {
        if (input == null) {
            return new HashMap<>();
        }

        return input.entrySet().stream()
                   .filter(entry -> entry.getValue() != null && entry.getValue().length() >= minLength)
                   .collect(Collectors.toMap(
                       Map.Entry::getKey,
                       entry -> entry.getValue().toUpperCase()
                   ));
    }
}