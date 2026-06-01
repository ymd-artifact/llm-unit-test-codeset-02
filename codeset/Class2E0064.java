import org.apache.commons.math3.stat.descriptive.moment.Mean;

public class Class2E0064 {
    private int value;

    public Class2E0064(int value) {
        this.value = value;
    }

    // Pattern: External library method call
    public int func2E0064(int input) {
        double[] numbers = new double[value];
        for (int i = 0; i < value; i++) {
            numbers[i] = input + i;
        }

        Mean mean = new Mean();
        double result = mean.evaluate(numbers);
        return (int)result + value;
    }
}