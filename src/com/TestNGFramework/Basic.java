package com.TestNGFramework;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basic {
    @Test
    public void TestNG() {
	// you need to have @Test Annotation followed by method

	// you can define multiple test for single class
	// you can modularize your test cases based on there functionality

	System.out.println("hello world");
	Assert.assertTrue(true);

    }
    @Parameters({"URL","Api"})
    @Test(groups= {"Smoke"})
    public void hello(String url,String key) {

	System.out.println("hello world this is kk");
	System.out.println(url);
	System.out.println(key);  }

    @Test(enabled=false)
    public void helloGirl() {

	System.out.println("hello world this is kk");
    }
    
    @Test(dataProvider="getData")
    public void dataproviderTest(String username ,String password) {
	
	System.out.println(username);
	System.out.println(password);
    }
    
    @DataProvider
    
    public Object[][] getData() {
	
	//1st combination -username password -good credit history
	//2nd username password -no credit history
	//3rd - fraudlent credit history
	
	Object[][] data = new Object[3][2];
	//1st set
	data[0][0]="firstsetUsername";
	data[0][1]="password";
	
	//column in the row are nothing but value for that particular combination(row)
	
	//2nd set
	data[1][0]="SecondsetUsername";
	data[1][1]="2ndpassword";
	
	
	//3rd set
	
	data[2][0]="ThirdsetUsername";
	data[2][1]="3rdpassword";
	return data;
	
    }

}

