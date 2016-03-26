package com.will.waitnotify.sample;

/**
 * @author Will
 * @date 16/3/25
 */
public class Main {
    public static void main(String[] args) {
        Sample sample = new Sample();
        Thread increaseThread = new Thread(new IncreaseThread(sample));
        Thread increaseThread2 = new Thread(new IncreaseThread(sample));
        Thread decreaseThread = new Thread(new DecreaseThread(sample));

        increaseThread.start();
        decreaseThread.start();
        increaseThread2.start();

    }
}
