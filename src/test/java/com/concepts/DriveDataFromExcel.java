/*
 * Developed by Anand Singh on 02/03/21, 1:38 PM.
 * Last modified 02/03/21, 1:38 PM.
 * Copyright (c) 2021. All rights reserved.
 */

package com.concepts;

import com.utils.TestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class DriveDataFromExcel {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("https://signup.ebay.in/pa/crte?ru=https%3A%2F%2Fwww.ebay.in%2Fb%2FWatches%2F14324");
    }

    @DataProvider
    public Iterator<Object[]> getTestData(){
      ArrayList<Object[]> testData = TestUtils.getDataFromExcel();
      return testData.iterator();
    }

    @Test(dataProvider = "getTestData")
    public void regPageTest(String firstName, String lastName, String email, String pass){
        System.out.println(firstName + " " + lastName+ " " + email+ " " +  pass);
        driver.findElement(By.xpath("//*[@id='firstname']")).clear();
        driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys(firstName);

        driver.findElement(By.xpath("//*[@id='lastname']")).clear();
        driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys(lastName);

        driver.findElement(By.xpath("//*[@id='Email']")).clear();
        driver.findElement(By.xpath("//*[@id='Email']")).sendKeys(email);

        driver.findElement(By.xpath("//*[@id='password']")).clear();
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys(pass);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
