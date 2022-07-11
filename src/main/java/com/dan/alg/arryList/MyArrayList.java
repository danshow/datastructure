package com.dan.alg.arryList;

import org.springframework.util.Assert;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyArrayList {
    private Object[] element;
    private int count=0;
    private int n;
    public MyArrayList(int n){
        this.n=n;
        this.count=0;
        this.element=new Object[n];
    }

    public void add(Object ele){
        //TODO handle overflow
        if(count>=n){
            throw new ArrayIndexOutOfBoundsException();
        }
        element[count++]=ele;
    }
    public boolean set(Object ele,int idx){
        Assert.isTrue(idx<n,"index array out of bound");
//        if(idx>n) return false;
        for(int i=count;i>=idx;i--){
            element[i]=element[i-1];
        }
        element[idx]=ele;

        return true;
    }
    public Object get(int index){
        if(index<count){
            return element[index];
        }else{
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public String toString(){
       return Stream.of(element)
               .filter(item->item!=null)
               .map(item -> item + " ")
               .collect(Collectors.joining(","));
    }

    public static void main(String[] args) {
        MyArrayList arrayList=new MyArrayList(10);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.set(4,3);
        arrayList.set(6,5);
        arrayList.set(7,7);
//        arrayList.get(10);

        System.out.println("idx 2: "+arrayList.get(2));
        System.out.println(arrayList.toString());
    }

}
