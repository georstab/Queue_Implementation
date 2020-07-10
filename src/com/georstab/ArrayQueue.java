package com.georstab;


import java.util.NoSuchElementException;

public class ArrayQueue {

    private Customer[] queue;
    int front;
    int back;

    public ArrayQueue(int capacity) {
        queue = new Customer[capacity];
    }

    public void add(Customer o) {
        if (back == queue.length){
            Customer[] newArray = new Customer[queue.length*2];
            System.arraycopy(queue,0,newArray,0,queue.length);
            queue = newArray;
        }
        queue[back] = o;
        back ++;
    }

    public Customer remove() {
        if (size() == 0){
            throw new NoSuchElementException("The queue is empty");
        }
        Customer temp = queue[front];
        queue[front] = null;
        front++;
        if (size() == 0) {
            front = 0;
            back = 0;
        }
        return temp;
    }

    public Customer peek() {
        if (size() == 0){
            throw new NoSuchElementException("The queue is empty");
        }
        return queue[front];
    }

    public int size() {
        return back - front;
    }

    public void printQue() {
        for (int i=front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }

}
