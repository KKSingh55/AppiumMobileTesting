import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class EcommerceAP_TC_1 extends base {

    public static void main(String[] args) throws MalformedURLException {


	AndroidDriver<AndroidElement> driver = capabilities("real");	

	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	driver.findElementByXPath("//android.widget.EditText[@text='Enter name here']").sendKeys("rina");
	driver.hideKeyboard();
	driver.findElementByXPath("//android.widget.RadioButton[@text='Female']").click();
	driver.findElementById("android:id/text1").click();
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
		".scrollIntoView(text(\"Albania\"));");
	driver.findElementByXPath("//*[@text='Albania']").click();

	driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	//String toastMsg = driver.findElementByXPath("//android.widget.Toast[1]").getAttribute("name");
	//System.out.println(toastMsg);
	//Assert.assertEquals("Please enter your name",toastMsg);

	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()"
		+ ".resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView("
		+ "new UiSelector().text(\"Jordan 6 Rings\"));"));

	int count=    driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();

	for(int i=0;i<count;i++)

	{

	    String text=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();



	    if(text.equals("Jordan 6 Rings"))

	    {



		driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();

		break;

	    }


	}



	driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

	String lastpage =   driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
	Assert.assertEquals("Jordan 6 Rings", lastpage);
	
	
	

    }}
