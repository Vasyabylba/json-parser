package ru.clevertec.sbjson.databind.element;

public class BooleanElement extends ValueElement {
    private final boolean value;

    public BooleanElement(boolean v) {
        value = v;
    }

    @Override
    public String serialize() {
        return value ? "true" : "false";
    }
}
