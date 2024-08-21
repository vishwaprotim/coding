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

    /* Problem 2:
     * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
     *
     * Return the merged string.
     * Example 1:
     *
     * Input: word1 = "abc", word2 = "pqr"
     * Output: "apbqcr"
     * Explanation: The merged string will be merged as so:
     * word1:  a   b   c
     * word2:    p   q   r
     * merged: a p b q c r
     * Example 2:
     *
     * Input: word1 = "ab", word2 = "pqrs"
     * Output: "apbqrs"
     * Explanation: Notice that as word2 is longer, "rs" is appended to the end.
     * word1:  a   b
     * word2:    p   q   r   s
     * merged: a p b q   r   s
     */


    public static String mergeAlternately(String str1, String str2){
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        char[] op = new char[arr1.length + arr2.length];
        int i = 0, p1=0, p2=0;
        while(p1 < arr1.length &&  p2 < arr2.length){
            if(i%2==0){
                op[i++] = arr1[p1++];
            } else{
                op[i++] = arr2[p2++];
            }
        }

        // Check which arr is pending and copy the characters to output from that arr
        while(p1 < arr1.length){
            op[i++] = arr1[p1++];
        }
        while(p2 < arr2.length){
            op[i++] = arr2[p2++];
        }

        return new String(op);

    }


}
