package com.jc.aim.algo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindNthPowerTest {
    @Test(enabled = true)
    public void testPow() {
        // Test case 1: X = 2, N = 5
        Assert.assertEquals(FindNthPower.pow(2, 5), 32);

        // Test case 2: X = 0, N = 0 (edge case where both X and N are 0)
        Assert.assertEquals(FindNthPower.pow(0, 0), 1);

        // Test case 3: X = 3, N = 0 (edge case where N is 0)
        Assert.assertEquals(FindNthPower.pow(3, 0), 1);

        // Test case 4: X = 0, N = 5 (edge case where X is 0)
        Assert.assertEquals(FindNthPower.pow(0, 5), 0);

        // Test case 5: X = 1, N = 100 (edge case where X is 1)
        Assert.assertEquals(FindNthPower.pow(1, 100), 1);

        // Test case 6: X = -2, N = 3 (negative X value)
        Assert.assertEquals(FindNthPower.pow(-2, 3), -8);
    }

    @Test
    public void testPowEfficient() {
        // Test case 1: X = 2, N = 5
        Assert.assertEquals(FindNthPower.powEfficient(2, 5), 32);

        // Test case 2: X = 0, N = 0 (edge case where both X and N are 0)
        Assert.assertEquals(FindNthPower.powEfficient(0, 0), 1);

        // Test case 3: X = 3, N = 0 (edge case where N is 0)
        Assert.assertEquals(FindNthPower.powEfficient(3, 0), 1);

        // Test case 4: X = 0, N = 5 (edge case where X is 0)
        Assert.assertEquals(FindNthPower.powEfficient(0, 5), 0);

        // Test case 5: X = 1, N = 100 (edge case where X is 1)
        Assert.assertEquals(FindNthPower.powEfficient(1, 100), 1);

        // Test case 6: X = -2, N = 3 (negative X value)
        Assert.assertEquals(FindNthPower.powEfficient(-2, 3), -8);
    }

}