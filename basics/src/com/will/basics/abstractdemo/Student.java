package com.will.basics.abstractdemo;

/**
 * @author Will
 * @date 16/5/11
 */
public abstract class Student extends Person {
    final int gender;

    private double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student(int age, String name, double score, int gender) {
        super(age, name);
        this.gender = gender;
        this.score = score;
    }

    @Override
    public void say() {

    }

}
