package com.MobilleTesting;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TestCase_01 extends MobileBrowserTesting {

    public static void main(String[] args) throws MalformedURLException {
	// TODO Auto-generated method stub
	
	AndroidDriver<AndroidElement> driver = Capabilities();
	driver.get("https://rahulshettyacademy.com/angularAppdemo/");
	driver.findElement(By.cssSelector(".navbar-toggler")).click();
	driver.findElement(By.cssSelector("a[href*='products']")).click();
	
	JavascriptExecutor js= (JavascriptExecutor)driver;

	js.executeScript("window.scrollBy(0,500)", "");
	
	String test = driver.findElement(By.xpath("//a[contains(text(),'Appium')]")).getText();

	Assert.assertEquals(test, "Appium1");
	
	
    }

}
