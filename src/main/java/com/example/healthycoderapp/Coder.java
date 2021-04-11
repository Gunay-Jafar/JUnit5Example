package com.example.healthycoderapp;

public class Coder {

    private double height;
    private double weight;
    private int age;
    private String gender;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Coder(double height, double weight) {
        this.height = height;
        this.weight = weight;

    }
}
