/*
 * Developed by Anand Singh on 05/03/21, 10:24 PM.
 * Last modified 05/03/21, 10:24 PM.
 * Copyright (c) 2021. All rights reserved.
 */

package com.concepts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssetFeature {

    @Test
    public void test(){
        SoftAssert softAssert = new SoftAssert();
        System.out.println("open browser");
        softAssert.assertEquals(false, true);
        System.out.println("enter username");
        System.out.println("enter pass");
        System.out.println("click on the login button");
        System.out.println("validate home page");
        softAssert.assertAll();
    }
}
