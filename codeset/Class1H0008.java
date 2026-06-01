import java.lang.annotation.*;

@Inherited
@interface InheritedAnnotation {
    String value() default "";
}

@InheritedAnnotation("Processes input value")
public class Class1H0008 {
    public int func1H0008(int input) {
        return input * 7;
    }
}

// Child class will inherit the annotation
class Class1H0008Child extends Class1H0008 {
    @Override
    public int func1H0008(int input) {
        return input * 8;
    }
}