package com.dsawithkunal.linearSearch;

import java.util.Arrays;

public class LinearSearch2dArray {

    public static void main(String[] args) {

        int[][] arr={
                {2,43,56,73,56,567,24,5},
                {2,3,67,7,2,4,7,3,36,46},
                {23,45,67,23,45,34,2,3}
        };
        int target = 567 ;

        System.out.println(search2d_2(arr));

    }

    //find max element in an 2dArray suing LinearSearch
    static int search2d_2(int[][] arr){


        if(arr.length == 0){
            return Integer.MIN_VALUE;
        }

        int max = arr[0][0];

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                int element  =  arr[row][column];
                if(element>max){
                    max = element;
                }
            }
        }

        return max;
    }


    //search in 2D array
    static int[] search2d(int[][] arr, int target){
        
        if(arr.length == 0){
            return new int[]{-1, -1};
        }


        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                int element  =  arr[row][column];
                if(element==target){
                    return new int[]{row,column};
                }
            }
        }

        return new int[]{-1,-1};
    }

}
