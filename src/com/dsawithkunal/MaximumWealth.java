package com.dsawithkunal;


//Question
//https://leetcode.com/problems/richest-customer-wealth/

public class MaximumWealth {

    public static void main(String[] args) {
        int[][] a={{5,5,6,6,66,6},{78,6,},{7,75658}};
        System.out.println(wealth(a));;
    }

    
    static int wealth(int[][] arr){
        
        int maxValue = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            
            int total = 0;
            
            
            for(int j=0;j<arr[i].length;j++){
                
                total += arr[i][j];
                
            }
            
            if(total>maxValue){
                maxValue = total ;
            }
            else{
                total=0;
            }
            
        }
        
        return maxValue;
        
    }
    
}