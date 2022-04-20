package com.TestNGFramework;

import org.testng.annotations.Test;

public class Basic1 {
    
    @Test(timeOut =4000)
    public void mobileLogin() {
	
	System.out.println("mobile login");
    }
    @Test(dependsOnMethods= {"mobilepasss"})
    public void mobileLogOut() {
	
	System.out.println("mobile out");
    }
    @Test
    public void  mobilepasss() {
	
	System.out.println("mobile pass");
    }
    
    @Test
    public void passsedaway() {
	
	System.out.println("mobile pass");
    }
    
    @Test
    public void loneHome() {
	
	System.out.println("lone home");
    }


}
