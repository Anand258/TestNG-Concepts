/*
 * Developed by Anand Singh on 05/03/21, 10:21 PM.
 * Last modified 02/03/21, 10:50 PM.
 * Copyright (c) 2021. All rights reserved.
 */

package com.utils;

import java.util.ArrayList;

public class TestUtils {

    static Xls_Reader reader;

    public static ArrayList<Object[]> getDataFromExcel(){
        ArrayList<Object[]> myData = new ArrayList<>();
        String sheetName = "regTestData";
        try {
            reader = new Xls_Reader("/Users/anasingh/IdeaProjects/TestNG-Concepts/src/test/Resources/testData.xlsx", sheetName);
        } catch (Exception e){
            e.printStackTrace();
        }
        for(int rowCount = 2; rowCount<=reader.getRowCount(sheetName); rowCount++){
            String firstName = reader.getCellData(sheetName, "firstName", rowCount);
            String lastName = reader.getCellData(sheetName, "lastName", rowCount);
            String email = reader.getCellData(sheetName, "email", rowCount);
            String password = reader.getCellData(sheetName, "password", rowCount);

            Object ob[] = {firstName, lastName, email, password};
            myData.add(ob);
        }
        return myData;
    }

}
