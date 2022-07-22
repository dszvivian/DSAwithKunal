package com.dsawithkunal.binarySearch;

public class BinarySearch {

    public static void main(String[] args) {

        int[] a={-23,-20,12,34,56,67,78,89,90,107,169,699};
        int target = -23;

        System.out.println(binarySearch(a,target));;

    }

    //can be applied only if given array is Sorted
    //Binary Search for ascending order array
    //function will return the index no the element if exits
    //else it will return -1
    static int binarySearch(int[] arr , int target){
        int start = 0 ;
        int end = arr.length-1 ;



        while(start<=end){

            //int mid = (start+end)/2;
            //if the start and end values are too high
            //then (start+end) may exceed the Integer maximum value
            //So better way to find mid
            int mid = start + ((end-start)/2);

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                //array lies on the left side of the mid
                end=mid-1;
            }
            else{
                //arr[mid]<target
                //array lies on the right side of the array
                start=mid+1;

            }


        }

        return -1;
    }

}
