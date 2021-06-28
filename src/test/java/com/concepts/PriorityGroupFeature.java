/*
 * Developed by Anand Singh on 23/02/21, 8:29 PM.
 * Last modified 23/02/21, 8:26 PM.
 * Copyright (c) 2021. All rights reserved.
 */

package com.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PriorityGroupFeature {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://www.google.com");
    }

    @Test(priority = 1, groups = "title")
    public void googleTitleTest(){
        String title = driver.getTitle();
        Assert.assertEquals(title, "Google123", "Title is not matched.");
    }

    @Test(priority = 2, groups = "logo")
    public void googleLogoTest(){
        Boolean b = driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
        Assert.assertTrue(b);
    }

    @Test(priority = 3, groups = "link")
    public void gmailLinkTest(){
        Boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
        Assert.assertTrue(b);
    }

    @Test(priority = 4, groups = "test")
    public void test1(){
        System.out.println("test1");
    }

    @Test(priority = 5, enabled = false, groups = "test")
    public void test2(){
        System.out.println("test2");
    }

    @Test(priority = 6, groups = "test")
    public void test3(){
        System.out.println("test3");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
