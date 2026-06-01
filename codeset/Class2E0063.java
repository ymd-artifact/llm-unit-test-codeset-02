import java.util.Arrays;
import java.lang.Math;

public class Class2E0063 {
    private int value;

    public Class2E0063(int value) {
        this.value = value;
    }

    // Pattern: Java standard library method call
    public int func2E0063(int input) {
        int[] numbers = new int[value];
        for (int i = 0; i < value; i++) {
            numbers[i] = Math.abs(input - i);
        }

        Arrays.sort(numbers);
        return numbers[numbers.length - 1] + value;
    }
}