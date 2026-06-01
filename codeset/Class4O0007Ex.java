public enum Class4O0007Ex implements ValueOfEnum {
    VALUE_ONE("One"),
    VALUE_TWO("Two"),
    VALUE_THREE("Three"),
    VALUE_FOUR("Four"),
    VALUE_FIVE("Five");

    private final String value;

    Class4O0007Ex(String value) {
        this.value = value;
    }

    @Override
    public String toValue() {
        return this.value;
    }
}