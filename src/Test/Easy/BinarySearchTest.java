package Test.Easy;

import Easy.*;
import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {


    BinarySearch sb = new BinarySearch();

    @Test
    public void test1(){
        int[] arr = new int[] {-1,0,3,5,9,12};
        Assert.assertEquals(4,sb.search(arr,9));
    }

    @Test
    public void test2(){
        int[] arr = new int[] {-1,0,3,5,9,12};
        Assert.assertEquals(-1,sb.search(arr,2));
    }

}
