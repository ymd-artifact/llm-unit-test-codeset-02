import java.lang.annotation.*;

@Target(ElementType.METHOD)
@interface MethodAnnotation {
    String value() default "";
}

public class Class1H0007 {
    @MethodAnnotation("Processes input value")
    public int func1H0007(int input) {
        return input * 6;
    }
}