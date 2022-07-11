package com.dan.alg.benchmark;

public class FibTest {
    public static void main(String[] args) {
        new FibTest().doTest();
    }
    public void doTest(){
        double l;
        int nLoops=50;
        long then= System.currentTimeMillis();
//        for(int i=0;i<nLoops;i++){
            l=fibImpl(45);
//        }
        long now= System.currentTimeMillis();
        System.out.println("res: "+l+" Elapsed time : " +(now-then));
    }

    private double fibImpl(int n) {
        if(n<0) throw new IllegalArgumentException("Must be >0");
        if(n==0) return 0d;
        if(n==1) return 1d;
        double d=fibImpl(n-2) +fibImpl(n-1);
        if(Double.isInfinite(d)) throw  new ArithmeticException("Overflow");
        return d;
    }

}
