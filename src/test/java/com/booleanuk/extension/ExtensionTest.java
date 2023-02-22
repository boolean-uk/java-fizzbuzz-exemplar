package com.booleanuk.extension;

import com.booleanuk.core.Exercise;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExtensionTest {
    Extension extension;
    public ExtensionTest() {
        this.extension = new Extension();
    }
    @Test
    public void fizzbuzz() {
        String[] shouldBeOne = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "Fizzbuzz"};
        Assertions.assertArrayEquals(shouldBeOne, this.extension.fizzbuzz(1, 15));
    }
}
