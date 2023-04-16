package Test.Easy;

import Easy.RomanToInteger;
import org.junit.Assert;
import org.junit.Test;

public class RomanToIntegerTest {

    RomanToInteger romanToInteger = new RomanToInteger();

    @Test
    public void test1() {
        Assert.assertEquals(3, romanToInteger.romanToInt("III"));
    }

    @Test public void test2() {
        Assert.assertEquals(58, romanToInteger.romanToInt("LVIII"));
    }

    @Test public void test3() {
        Assert.assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
    }

}
