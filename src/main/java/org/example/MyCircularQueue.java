package org.example;

import java.util.Arrays;

public class MyCircularQueue {
    public MyCircularQueue(int k) {
        queue = new int[k];
        Arrays.fill(queue, -1);
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }

        int len = queue.length;
        queue[(rear + 1) % len] = value;
        rear += 1;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }

        int len = queue.length;
        queue[(front + 1) % len] = -1;
        front -= 1;


        return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return queue[front];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return queue[rear];
    }

    public boolean isEmpty() {
        return queue[0] == -1;
    }

    public boolean isFull() {
        return queue[queue.length - 1] >= 0;
    }

    private int[] queue;
    private int front = -1;
    private int rear = -1;

}
