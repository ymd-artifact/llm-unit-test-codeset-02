public class Class1H0003 {
    @SafeVarargs
    public final <T extends Number> int func1H0003(T... numbers) {
        int result = 0;
        for (T number : numbers) {
            result += number.intValue();
        }
        return result;
    }
}