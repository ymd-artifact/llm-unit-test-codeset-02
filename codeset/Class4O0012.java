public class Class4O0012 {

        public String func4O0012() {
        return a("test", 42);
    }

    public String a(String str) {
        return "First overload: " + str;
    }

    public String a(String str, int num) {
        return "Second overload: " + str + " - " + num;
    }
}