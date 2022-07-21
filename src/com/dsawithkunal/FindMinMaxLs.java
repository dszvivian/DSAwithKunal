package com.dsawithkunal;

public class FindMinMaxLs {

    public static void main(String[] args) {

        int[] a = {232, 54, 23, 57, 23, 34, 2, 12, 23, 23, 3245, -7756};
        System.out.println(findMin(a));
        System.out.println(findMax(a));

    }


    //return the minimum element in am array using Linear Search
    static int findMin(int[] arr) {


        //check if arr is null
        if (arr.length == 0) {
            return -1;
        }


        int minimum = arr[0];

        //check for the element
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element < minimum) {
                minimum = element;
            }
        }

        //if none of the above conditions works
        return minimum;
    }



    //return the maximum element in am array using Linear Search
    static int findMax(int[] arr) {


        //check if arr is null
        if (arr.length == 0) {
            return -1;
        }


        int maximum = arr[0];

        //check for the element
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element > maximum) {
                maximum = element;
            }
        }

        //if none of the above conditions works
        return maximum;
    }

}
