package com.dsawithkunal.linearSearch;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr={23,54,5,76,8,78,23,345,45};
        int result = linearSearch(arr,5);
        System.out.println(result);

    }

    //search in the array
    //return the array if the array found else return -1

    static int linearSearch(int[] arr, int target){
        //check if arr is null
        if(arr.length == 0){
            return -1;
        }

        //check for the element
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element==target){
                return index;
            }
        }

        //if none of the above conditions works
        return -1;
    }

}
