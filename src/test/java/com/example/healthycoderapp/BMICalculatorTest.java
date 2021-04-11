package com.example.healthycoderapp;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BMICalculatorTest {

    @Test
    void CoderListNotEmpty() {

        List<Coder> coders = new ArrayList<>();
        coders.add(new Coder(1.80, 60.0));
        coders.add(new Coder(1.82, 98.0));
        coders.add(new Coder(1.82, 64.7));

        Coder coder = BMICalculator.findCoderWithWorstBMI(coders);

        assertAll(
                () -> assertEquals(1.82, coder.getHeight()),
                () -> assertEquals(98.0, coder.getWeight())

        );
    }
}
