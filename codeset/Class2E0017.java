public class Class2E0017 {
    /**
     * This method calculates the factorial of a given number using recursion.
     * @param n the number to calculate the factorial of
     * @return the factorial of the given number
     */
    public int func2E0017(int n) {
        if (n == 0) {
            return 1;
        }
        return n * func2E0017(n - 1);
    }
}