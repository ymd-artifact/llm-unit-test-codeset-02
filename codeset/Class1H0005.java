import java.lang.annotation.*;

@Documented
@interface DocumentedAnnotation {
    String value() default "";
}

public class Class1H0005 {
    @DocumentedAnnotation("Processes input value")
    public int func1H0005(int input) {
        return input * 4;
    }
}