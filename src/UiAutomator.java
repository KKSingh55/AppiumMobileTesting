import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UiAutomator extends base {

    public static void main(String[] args) throws MalformedURLException {
	
	AndroidDriver<AndroidElement> driver  = capabilities() ;
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	//("attribute(\"value\")")
	driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	
	//"new UiSelector().property(value)"
	
System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(false)").size());	
	

    }

}
