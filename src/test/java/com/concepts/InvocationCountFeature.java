/*
 * Developed by Anand Singh on 23/02/21, 8:59 PM.
 * Last modified 23/02/21, 8:59 PM.
 * Copyright (c) 2021. All rights reserved.
 */

package com.concepts;

import org.testng.annotations.Test;

public class InvocationCountFeature {

    @Test(invocationCount = 10)
    public void sum(){
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
    }
}
