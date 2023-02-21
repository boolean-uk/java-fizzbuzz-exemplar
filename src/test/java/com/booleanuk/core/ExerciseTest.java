package com.booleanuk.core;

import com.booleanuk.core.Exercise;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExerciseTest {

    Exercise exercise;
    public ExerciseTest() {
        this.exercise = new Exercise();
    }
    @Test
    public void fizzbuzz() {
        String[] shouldBeOne = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14"};
        Assertions.assertArrayEquals(shouldBeOne, this.exercise.fizzbuzz(1, 15));
    }
}
