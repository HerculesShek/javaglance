package com.will.waitnotify.consumerproductor;

/**
 * 仓库
 *
 * @author Will
 * @date 16/3/25
 */
public class Godown {
    public static final int MAX_SIZE = 100;
    private int curNum;

    public Godown() {
    }

    public Godown(int curNum) {
        this.curNum = curNum;
    }

    public synchronized void produce(int num) {
        while (curNum + num > MAX_SIZE) {
            System.out.println("需要生产[" + num + "]和当前库存[" + curNum + "]之和[" + (curNum + num) + "]超过最大库存量[" + MAX_SIZE + "] wait...");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        curNum += num;
        System.out.println("新生产了[" + num + "]个产品,当前存库为[" + curNum + "]");
        notifyAll();
    }

    public synchronized void consume(int num) {
        while (num > curNum) {
            System.out.println("消费需求量[" + num + "]超过当前库存[" + curNum + "] wait...");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        curNum -= num;
        System.out.println("新消费了[" + num + "]个产品,当前存库为[" + curNum + "]");
        notifyAll();
    }
}
