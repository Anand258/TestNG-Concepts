/*
 * Developed by Anand Singh on 05/03/21, 10:21 PM.
 * Last modified 05/03/21, 9:58 PM.
 * Copyright (c) 2021. All rights reserved.
 */

package com.utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    int counter = 0;
    int retryLimit = 3;

    public boolean retry(ITestResult result){
        if(counter < retryLimit) {
            counter++;
            return true;
        }
        return false;
    }

}
