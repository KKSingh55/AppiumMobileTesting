package com.TestNGFramework;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
    
    @Override
    public void onTestFailure(ITestResult result) {
	//Screeshot
		//response if api is failed
		
	System.out.println("I failed executed my test case "+result.getName());
    }
    
    @Override
    public void onTestSuccess(ITestResult result) {
	
	
	System.out.println("I succesfully executed my test case");
	
    }
        

}
