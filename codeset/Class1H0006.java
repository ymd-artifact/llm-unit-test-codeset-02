import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface RetentionAnnotation {
    String value() default "";
}

public class Class1H0006 {
    @RetentionAnnotation("Processes input value")
    public int func1H0006(int input) {
        return input * 5;
    }
}