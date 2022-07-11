package com.dan.alg.arryList;

import org.springframework.util.Assert;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyStack {
    private int n;
    private int count;
    private Object[] ele;
    public MyStack(int n){
        ele=new Object[n];
//        this.n=n;
        count=0;
    }

    public boolean push(Object e){
        if(count==ele.length){
            throw new ArrayIndexOutOfBoundsException();
        }
        ele[count++]=e;
        return true;
    }
    public Object pop(){
        Assert.isTrue(count>0,"No Element in Stack.");
        Object e=ele[count-1];
        count--;
        return e;
    }
    public Object peek(){
        return ele[count-1];
    }
    @Override
    public String toString(){
        return Stream.of(ele)
                .filter(item->item!=null)
                .map(item -> item + " ")
                .collect(Collectors.joining(","));
    }
    public static void main(String[] args) {
        MyStack stack=new MyStack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(5);
        System.out.println(stack.peek());
        System.out.println("top "+stack.pop());
        stack.push(6);
        System.out.println(stack);
    }

}
