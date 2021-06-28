/*
 * Developed by Anand Singh on 23/02/21, 8:54 PM.
 * Last modified 23/02/21, 8:54 PM.
 * Copyright (c) 2021. All rights reserved.
 */

package com.concepts;

import org.testng.annotations.Test;

public class DependencyFeature {

    @Test
    public void loginTest(){
        System.out.println("login test");
        int i = 9/0;
    }

    @Test(dependsOnMethods = "loginTest")
    public void homePageTest(){
        System.out.println("home page test");
    }

    @Test(dependsOnMethods = "loginTest")
    public void searchPageTest(){
        System.out.println("search page test");
    }

    @Test(dependsOnMethods = "loginTest")
    public void regPageTest(){
        System.out.println("reg page test");
    }
}
