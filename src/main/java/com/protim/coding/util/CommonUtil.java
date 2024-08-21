package com.protim.coding.util;

public class CommonUtil {

    public static boolean isPallindrome(String str){
        if(str == null || str.trim().isEmpty()){
            return false;
        }
        str = str.trim().toUpperCase();
        if(str.length() == 1){
            return true;
        }

        char[] arr = str.toCharArray();
        int midIndex = str.length()/2 -1;
        int lastIndex = str.length() -1;

        for(int i = 0, j = lastIndex; i <= midIndex; i++, j--){
            if(arr[i] != arr[j]){
                return false;
            }
        }

        return true;
    }
}
