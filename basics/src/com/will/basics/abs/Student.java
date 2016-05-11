package com.will.basics.abs;

/**
 * @author Will
 * @date 16/5/11
 */
public abstract class Student extends Person {
    private double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student(int age, String name, double score) {
        this.score = score;
    }

    @Override
    public void say() {

    }
}
