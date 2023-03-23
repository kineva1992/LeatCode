package Test.Easy;

import Easy.TwoSum;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class TwoSumTest {

    TwoSum twoSum = new TwoSum();

    @Test
    public void test1() {
        int[] testArray = new int[] {2,7,11,15};
        int[] resultArray = new int[] {1,0};
        Assert.assertArrayEquals(resultArray, twoSum.twoSum(testArray, 9));

    }

    @Test public void test2() {
        Assert.assertArrayEquals(new int[]{2,1}, twoSum.twoSum(new int[]{3,2,4}, 6));
    }

    @Test public void test3() {
        Assert.assertArrayEquals(new int[]{1,0}, twoSum.twoSum(new int[]{3,3}, 6));
    }
}
