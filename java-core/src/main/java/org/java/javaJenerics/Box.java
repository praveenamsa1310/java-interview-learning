package org.java.javaJenerics;

public class Box<T> {

    T value;

    void setValue(T value) {
        this.value = value;
    }
    T getValue() {
        return value;
    }
}
