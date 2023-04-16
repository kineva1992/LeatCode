package Test.Medium;

import Medium.BasicCalculator2;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BasicCalculator2Test {


    BasicCalculator2 sc2 = new BasicCalculator2();

    @Test
    public void test1() {

        Assert.assertEquals(7, sc2.calculate("3+2*2"));

    }

    @Test
    public void test2() {
        Assert.assertEquals(1, sc2.calculate("3/2"));
    }

    @Test
    public void test3() {
        Assert.assertEquals(5, sc2.calculate("3+5 / 2"));
    }


}
