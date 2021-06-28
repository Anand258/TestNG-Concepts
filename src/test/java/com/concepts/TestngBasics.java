/*
 * Developed by Anand Singh on 23/02/21, 8:34 PM.
 * Last modified 23/02/21, 8:34 PM.
 * Copyright (c) 2021. All rights reserved.
 */

package com.concepts;

import org.testng.annotations.*;

public class TestngBasics {

    // pre condition annotation -- starting with Before
    @BeforeSuite //1
    public void setup(){
        System.out.println("setup system property for chrome");
    }

    @BeforeTest //2
    public void launchBrowser(){
        System.out.println("launch chrome browser");
    }

    @BeforeClass //3
    public void login(){
        System.out.println("login to app");
    }

    @BeforeMethod //4
    public void enterURL(){
        System.out.println("enter URL");
    }

    // test cases -- starting with Test
    @Test //5
    public void googleTitleTest(){
        System.out.println("Google title test");
    }

    @Test //5
    public void searchTest(){
        System.out.println("search test");
    }

    // post condition annotation -- starting with After
    @AfterMethod //6
    public void logout(){
        System.out.println("logout from app");
    }

    @AfterClass //7
    public void deleteAllCookies(){
        System.out.println("delete all cookies");
    }

    @AfterTest //8
    public void closeBrowser(){
        System.out.println("close browser");
    }

    @AfterSuite //9
    public void generateReport(){
        System.out.println("generate report");
    }
}
