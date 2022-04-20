

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class GestureSwip extends base {

    public static void main(String[] args) throws MalformedURLException {

	AndroidDriver<AndroidElement> driver = capabilities("real");	

	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	
	driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
	
	driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
	
	driver.findElementByXPath("//*[@content-desc='9']").click();
	
	TouchAction tc = new TouchAction(driver);
	
	//long press // on element // 2 sec // move to another element and you release
	WebElement ele3 = driver.findElementByXPath("//*[@content-desc='15']");
	WebElement ele4 = driver.findElementByXPath("//*[@content-desc='45']");
	tc.longPress(longPressOptions().withElement(element(ele3)).withDuration(ofSeconds(2))).
	moveTo(element(ele4)).release().perform();	
	
	//if special character present in the tag name we can't use xpath



    }

}
