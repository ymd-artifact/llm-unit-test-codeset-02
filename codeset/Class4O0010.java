public class Class4O0010 {

    public String func4O0010() {
        InternalEnum selectedValue = InternalEnum.VALUE_C;
        return selectedValue.name();
    }

    enum InternalEnum {
        VALUE_A,
        VALUE_B,
        VALUE_C,
        VALUE_D,
        VALUE_E;
    }
}