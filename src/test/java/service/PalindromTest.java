package service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromTest {

    @Test
    void isPalindromTest() {
        Assertions.assertTrue(Palindrom.isPalindrom("aba"));
    }
}