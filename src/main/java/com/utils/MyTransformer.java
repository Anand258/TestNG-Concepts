/*
 * Developed by Anand Singh on 05/03/21, 10:21 PM.
 * Last modified 05/03/21, 10:12 PM.
 * Copyright (c) 2021. All rights reserved.
 */

package com.utils;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MyTransformer implements IAnnotationTransformer {

    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod){
        annotation.setRetryAnalyzer(RetryAnalyzer.class);
    }

}
