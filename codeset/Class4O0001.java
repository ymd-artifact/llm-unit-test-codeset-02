public class Class4O0001 {
    private final Class4O0000Ex00 ex00;
    private final Class4O0000Ex01 ex01;
    private final Class4O0000Ex02 ex02;

    public Class4O0001(Class4O0000Ex00 ex00, Class4O0000Ex01 ex01, Class4O0000Ex02 ex02) {
        this.ex00 = ex00;
        this.ex01 = ex01;
        this.ex02 = ex02;
    }

    public String func4O0001() {
        String result1 = ex00.method4O0000Ex00();
        String result2 = ex01.method4O0000Ex01();
        String result3 = ex02.method4O0000Ex02();
        return result1 + " " + result2 + " " + result3;
    }
}