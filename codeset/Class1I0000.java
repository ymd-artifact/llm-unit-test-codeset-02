import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Class demonstrating List operations for unit testing
 */
public class Class1I0000 {
    /**
     * Process a list of strings by filtering out null values and strings shorter than minLength,
     * then convert remaining strings to uppercase
     *
     * @param input list of strings to process
     * @param minLength minimum length requirement for strings
     * @return processed list of uppercase strings meeting the length requirement
     */
    public List<String> func1I0000(List<String> input, int minLength) {
        if (input == null) {
            return new ArrayList<>();
        }

        return input.stream()
                   .filter(str -> str != null && str.length() >= minLength)
                   .map(String::toUpperCase)
                   .collect(Collectors.toList());
    }
}