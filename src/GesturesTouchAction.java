import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;


import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

public class GesturesTouchAction extends base{

    public static void main(String[] args) throws MalformedURLException {
	
	AndroidDriver<AndroidElement> driver = capabilities();	
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	//Tap
	
	TouchAction tc = new TouchAction(driver);
	WebElement ele = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
	tc.tap(tapOptions().withElement(element(ele))).perform();
	
	WebElement ele1 = driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']");
	
	tc.tap(tapOptions().withElement(element(ele1))).perform();
	
	WebElement ele2 = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
	
	tc.longPress(longPressOptions().withElement(element(ele2)).withDuration(ofSeconds(2))).release().perform();
	
	WebElement chck  = driver.findElementByXPath("//android.widget.TextView[@text='Sample menu']");
	
	System.out.println (chck.isDisplayed());
    }

}
