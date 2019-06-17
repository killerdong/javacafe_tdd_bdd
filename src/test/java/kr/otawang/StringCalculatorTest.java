package kr.otawang;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

    StringCalculator cal;

    @Before
    public void init() {
        cal = new StringCalculator();
    }

    @Test
    public void addWhenEmpty() {
        Assert.assertEquals(0, cal.add(""));
    }

    @Test
    public void addWhenSingleNumber() {
        Assert.assertEquals(1, cal.add("1"));
        Assert.assertEquals(2, cal.add("2"));
    }

    @Test
    public void addWhenTwoNumbers() {
        Assert.assertEquals(3, cal.add("1,2"));
        Assert.assertEquals(6, cal.add("2,4"));
    }

    @Test
    public void addWhenThreeNumbers() {
        Assert.assertEquals(6, cal.add("1,2,3"));
        Assert.assertEquals(10, cal.add("2,4,4"));
    }

    @Test
    public void addNumberWithAnotherSplit() {
        Assert.assertEquals(6, cal.add("1,2:3"));
        Assert.assertEquals(10, cal.add("2,4:4"));
    }



}
