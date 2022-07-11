package com.dan.alg.sort;

import java.util.Arrays;

public class MyMergeSort {

    public int[] sort(int[] arr){
         mergeSort(arr,0,arr.length-1);
         return  arr;
    }
    public void mergeSort(int[] arr,int start,int end){
        if(start>=end) return;
        int mid=(end+start)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,mid,end);

    }
    public void merge(int[] arr,int start,int mid,int end){

        System.out.println("start merge>>");
        int[] temp1=new int[end-start+1];
        for(int n=0;n<end-start+1;n++){
            temp1[n]=arr[start++];
        }
        System.out.println(Arrays.toString(temp1));
        System.out.println(".....");

        int[] temp=new int[end-start+1];
        int i=start,j=mid+1,k=0;

        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i];
                i++;
            }else{
                temp[k++]=arr[j];
                j++;
            }
        }

        if(i<mid){
            for(;i<=mid;i++){
                temp[k++]=arr[i];
            }
        }
        if(j<end){
            for(;j<=end;j++){
                temp[k++]=arr[j];
            }
        }

        for(int n=0;n<end-start;n++){
            arr[start++]=temp[n];
        }
    }

    public static void main(String[] args) {
        int[] arr={10,9,8,6,4,4,2,11,13};
        System.out.println(Arrays.toString(new MyMergeSort().sort(arr)));
    }
}
