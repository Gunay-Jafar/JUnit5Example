package com.example.healthycoderapp;

import java.util.Comparator;
import java.util.List;

public class BMICalculator {

    public static Coder findCoderWithWorstBMI(List<Coder> coders) {
        return coders.stream()
                .sorted(Comparator.comparing(BMICalculator::calculateBMI))
                .reduce((first,second)-> second)
                .orElse(null);
    }

    public static double calculateBMI(Coder coder) {
        double height = coder.getHeight();
        double weight =coder.getWeight();
        if (height==0.0) throw new ArithmeticException();
        double bmi = weight/(height* height);
        return Math.round(bmi*100) / 100.0 ;
    }
}
