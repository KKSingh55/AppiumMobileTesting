import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Ecommerce_TC_2 extends base{

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
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
	
	driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
	
	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()"
		+ ".resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView("
		+ "new UiSelector().text(\"Air Jordan 1 Mid SE\"));"));


	driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
	driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
	Thread.sleep(3000);
	
	String amount1 = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();
	 amount1 = amount1.substring(1);
	 double amont1value = Double.parseDouble(amount1);
	 String amount2 = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();
	 amount2 = amount2.substring(1);
	double amount2value =Double.parseDouble(amount2);
	
	String total = driver.findElementById("com.androidsample.generalstore:id/totalAmountLb1").getText();
         
	total = total.substring(1);
	 double totalcost = Double.parseDouble(total);
	 
	  double totalamount = amont1value + amount2value;
	  System.out.println("total value is " +totalamount );
	  
	  Assert.assertEquals(totalamount, totalcost);

    }

}
