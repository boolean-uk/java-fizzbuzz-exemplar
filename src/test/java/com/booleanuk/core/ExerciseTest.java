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
        String[] numsOne = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};
        String[] shouldBeOne = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "Fizzbuzz"};
        Assertions.assertArrayEquals(shouldBeOne, this.exercise.fizzbuzz(numsOne));
    }
}
