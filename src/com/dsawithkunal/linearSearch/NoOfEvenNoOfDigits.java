package com.dsawithkunal.linearSearch;

public class NoOfEvenNoOfDigits {

    public static void main(String[] args) {
        // write your code here
        int[] nums = {23,33,1234,3545,5767,8,67,3,33453};
        System.out.println(evenNoDigits(nums));

    }

    static int evenNoDigits(int[] arr){

        int noOfEvenNoDigits = 0 ;

        for (int i = 0; i < arr.length; i++) {
            if(even(arr[i])){
                noOfEvenNoDigits++;
            }
        }


        return noOfEvenNoDigits;
    }

    static int digits(int a){
        int digits = 0;


        while(a > 0) {
            digits++;
            a  = a/10;

        }


        return digits;

    }

    static boolean even(int a){
        int digits = digits(a);
        if(digits%2==0){
            return true;
        }

        return false;
    }
}

