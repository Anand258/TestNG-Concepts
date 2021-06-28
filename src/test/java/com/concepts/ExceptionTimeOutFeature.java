/*
 * Developed by Anand Singh on 23/02/21, 9:01 PM.
 * Last modified 23/02/21, 9:01 PM.
 * Copyright (c) 2021. All rights reserved.
 */

package com.concepts;

import org.testng.annotations.Test;

public class ExceptionTimeOutFeature {

    @Test(timeOut = 10000L)
    public void infiniteLoopTest(){
        int i = 1;
        while (i == 1){
            System.out.println(i);
        }
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void exceptionTest(){
        String x = "100A";
        Integer.parseInt(x);
    }
}
