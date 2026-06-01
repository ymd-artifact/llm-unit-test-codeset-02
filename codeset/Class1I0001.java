import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;

/**
 * Class demonstrating Set operations for unit testing
 */
public class Class1I0001 {
    /**
     * Process a set of strings by filtering out null values and strings shorter than minLength,
     * then convert remaining strings to uppercase
     *
     * @param input set of strings to process
     * @param minLength minimum length requirement for strings
     * @return processed set of uppercase strings meeting the length requirement
     */
    public Set<String> func1I0001(Set<String> input, int minLength) {
        if (input == null) {
            return new HashSet<>();
        }

        return input.stream()
                   .filter(str -> str != null && str.length() >= minLength)
                   .map(String::toUpperCase)
                   .collect(Collectors.toSet());
    }
}