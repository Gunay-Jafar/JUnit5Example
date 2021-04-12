package com.example.healthycoderapp;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class BMICalculatorTest {

    private String environment = "prod";

    @Test
    @DisplayName(">>>> sample method display name")
  //  @Disabled
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

    @Test
    void returnCoderWorst() {

        assumeTrue(this.environment.equals("prod"));
        List<Coder> coders = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            coders.add(new Coder(1.0 + i, 10.0 + i));
        }

        Executable executable = () -> BMICalculator.findCoderWithWorstBMI(coders);

        assertTimeout(Duration.ofMillis(500), executable);
    }

    @Test
    void BMIScoreArray_coderListNotEmpty() {

        List<Coder> coders = new ArrayList<>();
        coders.add(new Coder(1.80, 60.0));
        coders.add(new Coder(1.82, 98.0));
        coders.add(new Coder(1.82, 64.7));
        double[] expected = {18.52, 29.59, 19.53};

        double[] bmiScores = BMICalculator.getBMIScores(coders);

        assertArrayEquals(expected, bmiScores);
    }
}
