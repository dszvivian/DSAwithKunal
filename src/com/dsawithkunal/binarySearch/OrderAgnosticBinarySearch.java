package com.dsawithkunal.binarySearch;

public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {

        int[] arr = {169,155,140,130,120,110,69,60,50,39,20,10,-20,-89};
        int target = -20 ;
        System.out.println(orderAgnosticBinarySearch(arr,target));

    }



    //check whether the Given Array is Ascending or Descending
     //apply binary search

    static int orderAgnosticBinarySearch(int[] arr , int target){
        int start = 0 ;
        int end = arr.length-1 ;

        boolean isAscending = arr[start]<arr[end];


        while(start<=end){

            int mid = start + ((end-start)/2);

            if(arr[mid]==target){
                return mid;
            }

            if(isAscending){
                if(arr[mid]<target){
                    //arr[mid]<target
                    //array lies on the right side of the array
                    start=mid+1;
                }
                else {
                    //array lies on the left side of the mid
                    end=mid-1;
                }
            }
            else{
                if(arr[mid]<target){
                    //arr[mid]<target
                    //array lies on the left side of the array
                    end=mid-1;
                }
                else{
                    //array lies on the right side of the mid
                    start=mid+1;
                }
            }


        }

        return -1;
    }

}
