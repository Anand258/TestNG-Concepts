/*
 * Developed by Anand Singh on 05/03/21, 10:00 PM.
 * Last modified 05/03/21, 10:00 PM.
 * Copyright (c) 2021. All rights reserved.
 */

package com.concepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryFeature {

    @Test
    public void test1(){
        Assert.assertEquals(true, true);
    }

    @Test
    public void test2(){
        Assert.assertEquals(true, false);
    }
}
