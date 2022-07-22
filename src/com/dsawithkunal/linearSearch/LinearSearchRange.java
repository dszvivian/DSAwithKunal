package com.dsawithkunal.linearSearch;

public class LinearSearchRange {

    public static void main(String[] args) {

        int[] arr = {23,3,445,5,7,678,8,9,34,2,3};
        int target = 5;

        System.out.println(linearSearchRange(arr,target,5, arr.length-1));
        System.out.println(linearSearchRange(arr,target,1,5));

    }

    //search for a particular element for a Given Range
    static boolean linearSearchRange(int[] a , int target , int start , int end){

        if(end == 0){
            return false;
        }

        for (int i = start; i <= end ; i++) {
            if(target==a[i]){
                return true;
            }
        }

        return false;
    }

}
