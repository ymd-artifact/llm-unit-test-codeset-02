public class Class4O0003 {
    private final Class4O0000Ex00 ex00;
    private final Class4O0000Ex01 ex01;
    private final Class4O0000Ex02 ex02;
    private final Class4O0000Ex03 ex03;
    private final Class4O0000Ex04 ex04;
    private final Class4O0000Ex05 ex05;
    private final Class4O0000Ex06 ex06;
    private final Class4O0000Ex07 ex07;

    public Class4O0003(Class4O0000Ex00 ex00, Class4O0000Ex01 ex01, Class4O0000Ex02 ex02,
                       Class4O0000Ex03 ex03, Class4O0000Ex04 ex04, Class4O0000Ex05 ex05,
                       Class4O0000Ex06 ex06, Class4O0000Ex07 ex07) {
        this.ex00 = ex00;
        this.ex01 = ex01;
        this.ex02 = ex02;
        this.ex03 = ex03;
        this.ex04 = ex04;
        this.ex05 = ex05;
        this.ex06 = ex06;
        this.ex07 = ex07;
    }

    public String func4O0003() {
        String result1 = ex00.method4O0000Ex00();
        String result2 = ex01.method4O0000Ex01();
        String result3 = ex02.method4O0000Ex02();
        String result4 = ex03.method4O0000Ex03();
        String result5 = ex04.method4O0000Ex04();
        String result6 = ex05.method4O0000Ex05();
        String result7 = ex06.method4O0000Ex06();
        String result8 = ex07.method4O0000Ex07();
        return result1 + " " + result2 + " " + result3 + " " + result4 + " " +
               result5 + " " + result6 + " " + result7 + " " + result8;
    }
}