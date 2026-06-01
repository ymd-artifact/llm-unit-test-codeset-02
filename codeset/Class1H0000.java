// Parent class
class ParentClass {
    protected int value;

    public ParentClass(int value) {
        this.value = value;
    }

    public int func1H0000(int input) {
        return input + value;
    }
}

// Child class with override
public class Class1H0000 extends ParentClass {
    public Class1H0000(int value) {
        super(value);
    }

    @Override
    public int func1H0000(int input) {
        return input * value;
    }
}