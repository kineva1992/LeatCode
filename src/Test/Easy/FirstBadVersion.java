package Test.Easy;

import org.junit.Assert;
import org.junit.Test;
import Easy.*;

public class FirstBadVersion {

    Easy.FirstBadVersion fb = new Easy.FirstBadVersion();

    @Test
    public void test1(){
        Assert.assertEquals(4, fb.firstBadVersion(5));
    }

}
