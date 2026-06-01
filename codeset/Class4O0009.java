public class Class4O0009 {

    private Class4O0009Ex dependency;

    public Class4O0009() {
        this.dependency = new Class4O0009Ex();
    }

    public String func4O0009() {
        StringBuilder result = new StringBuilder();
        int loopCount = 0;

        while (dependency.method()) {
            loopCount++;
            result.append("Loop iteration ").append(loopCount).append("\n");
        }

        return result.toString();
    }
}