package Test.Easy;

import Easy.PalindromeNumber;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberTest {

    PalindromeNumber pn = new PalindromeNumber();

    @Test
    public void test1() {
        Assert.assertTrue(pn.isPalindrome(121));
    }

    @Test
    public void test2() {
        Assert.assertFalse(pn.isPalindrome(-121));
    }

    @Test
    public void test3() {
        Assert.assertTrue(pn.isPalindrome(10));
    }

}
