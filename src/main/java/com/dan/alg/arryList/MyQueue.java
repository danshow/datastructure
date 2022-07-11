package com.dan.alg.arryList;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyQueue {
    private Object[] ele;
    private int head;
    private int tail;

    public MyQueue(int size) {
        head=tail=0;
        ele = new Object[size];
    }

    public boolean enqueue(Object obj) {
        if(tail+1== ele.length) throw new IllegalStateException("queue is full");
        ele[tail++]=obj;
        return false;
    }
    public Object dequeue(){
        if(head==tail){
            throw new IllegalStateException("Element is empty.");
        }
        return ele[head++];
    }
    public int size(){
        return tail-head;
    }
    @Override
    public String toString(){
        return Stream.of(ele)
                .filter(ele->ele!=null)
                .map(item->item+"")
                .collect(Collectors.joining(","));
    }

    public static void main(String[] args) {
        MyQueue queue=new MyQueue(10);
//        queue.dequeue();//error
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(5);
        System.out.println("dequeue: "+queue.dequeue());
        System.out.println("dequeue: "+queue.dequeue());
        System.out.println("size=> "+queue.size());
        System.out.println("dequeue: "+queue.dequeue());
        System.out.println("size=> "+queue.size());
    }
}
