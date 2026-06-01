import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;

public class Class3B0009 {
    private Class3B0009Ex target;

    public Class3B0009(int value) throws ReflectiveOperationException {
        Class<?> targetClass = Class.forName("Class3B0009Ex");
        Constructor<?> constructor = targetClass.getDeclaredConstructor(int.class);
        constructor.setAccessible(true);
        this.target = (Class3B0009Ex) constructor.newInstance(value);
    }

    // Pattern: reflection
    public int func3B0009(String methodName, int input) throws ReflectiveOperationException {
        Method method = Class3B0009Ex.class.getDeclaredMethod(methodName, int.class);
        method.setAccessible(true);
        return (int) method.invoke(target, input);
    }

    // Using reflection to access private fields
    public int getValueViaReflection() throws ReflectiveOperationException {
        Field field = Class3B0009Ex.class.getDeclaredField("value");
        field.setAccessible(true);
        return (int) field.get(target);
    }

    // Method to set value via reflection
    public void setValueViaReflection(int newValue) throws ReflectiveOperationException {
        Method method = Class3B0009Ex.class.getDeclaredMethod("setValue", int.class);
        method.setAccessible(true);
        method.invoke(target, newValue);
    }
}