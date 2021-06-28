/*
 * Developed by Anand Singh on 23/02/21, 9:07 PM.
 * Last modified 23/02/21, 9:07 PM.
 * Copyright (c) 2021. All rights reserved.
 */

package com.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ParameterFeature {
    WebDriver driver;

    @Test
    @Parameters({"browser", "url", "emailId"})
    public void googleLogin(String browser, String url, String emailId){
        if(browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
            driver = new ChromeDriver();
        } else {
            System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
            driver = new FirefoxDriver();
        }

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(url);
        driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys(emailId);
        driver.findElement(By.xpath("//*[@id='identifierNext']/div/button")).click();
        driver.quit();
    }
}
