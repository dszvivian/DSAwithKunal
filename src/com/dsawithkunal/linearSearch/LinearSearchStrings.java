package com.dsawithkunal.linearSearch;

public class LinearSearchStrings {

    public static void main(String[] args) {
        boolean result = linearSearchString2("vivian" , 'v');
        System.out.println(result);
    }

    //using for each array
    static boolean linearSearchString2(String a , char target){
        //check if String is null
        if(a.length() == 0){
            return false;
        }

        //check for the element
        for(char c:a.toCharArray()){
            if(c==target){
                return true;
            }
        }

        //if none of the above conditions works
        return false;
    }


    //using normal for loop
    static int linearSearchString(String a , char target){
        //check if String is null
        if(a.length() == 0){
            return -1;
        }

        //check for the element
        for (int index = 0; index < a.length(); index++) {
            int element = a.charAt(index);
            if(element==target){
                return index;
            }
        }

        //if none of the above conditions works
        return -1;
    }

}
