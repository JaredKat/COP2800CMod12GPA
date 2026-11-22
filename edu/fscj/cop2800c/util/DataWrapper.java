// DataWrapper.java
// J. Leal
// 11/22/2026
// Generic wrapper for data objects
package edu.fscj.cop2800c.util;

import java.util.List;

public class DataWrapper<T> {
    private T value;

    // Constructor
    public DataWrapper(T value) {
        this.value = value;
    }

    // Returns the wrapped object
    public T getValue() {
        return value;
    }

    // Displays a list of wrapped objects
    public static <T> void displayList(List<DataWrapper<T>> list) {
        for (DataWrapper<T> element : list) {
            System.out.println(element.getValue());
        }
    }
}