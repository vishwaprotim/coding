package com.protim.coding.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CommonUtilTest {

    @Test
    void isPallindromeTest(){
        Assertions.assertFalse(CommonUtil.isPallindrome(null));
        Assertions.assertFalse(CommonUtil.isPallindrome(" "));
        Assertions.assertFalse(CommonUtil.isPallindrome("null"));

        Assertions.assertTrue(CommonUtil.isPallindrome("a"));
        Assertions.assertTrue(CommonUtil.isPallindrome("abcba"));
        Assertions.assertTrue(CommonUtil.isPallindrome("abccba"));
    }

    @Test
    void mergeAlternatelyTest(){
        Assertions.assertEquals("abc", CommonUtil.mergeAlternately("a", "bc"));
        Assertions.assertEquals("acb", CommonUtil.mergeAlternately("ab", "c"));
        Assertions.assertEquals("adbecf", CommonUtil.mergeAlternately("abc", "def"));
        Assertions.assertEquals("apbqrs", CommonUtil.mergeAlternately("ab", "pqrs"));
    }

}
