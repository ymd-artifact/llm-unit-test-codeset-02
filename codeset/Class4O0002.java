public class Class4O0002 {
    private final Class4O0000Ex00 ex00;
    private final Class4O0000Ex01 ex01;
    private final Class4O0000Ex02 ex02;
    private final Class4O0000Ex03 ex03;
    private final Class4O0000Ex04 ex04;

    public Class4O0002(Class4O0000Ex00 ex00, Class4O0000Ex01 ex01, Class4O0000Ex02 ex02,
                       Class4O0000Ex03 ex03, Class4O0000Ex04 ex04) {
        this.ex00 = ex00;
        this.ex01 = ex01;
        this.ex02 = ex02;
        this.ex03 = ex03;
        this.ex04 = ex04;
    }

    public String func4O0002() {
        String result1 = ex00.method4O0000Ex00();
        String result2 = ex01.method4O0000Ex01();
        String result3 = ex02.method4O0000Ex02();
        String result4 = ex03.method4O0000Ex03();
        String result5 = ex04.method4O0000Ex04();
        return result1 + " " + result2 + " " + result3 + " " + result4 + " " + result5;
    }
}