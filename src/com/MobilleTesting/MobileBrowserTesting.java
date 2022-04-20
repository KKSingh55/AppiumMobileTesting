package com.MobilleTesting;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileBrowserTesting {

    public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
	
	
	AndroidDriver<AndroidElement>  driver;
	
	//setting capabilities 
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Device");
	capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
	capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
	
	driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	
	//wd-- webdriver
	return driver;

    }

}