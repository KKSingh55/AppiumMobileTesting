import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

    public static  AndroidDriver<AndroidElement> capabilities(String device) throws MalformedURLException
    {

	//AandroidDriver ->

	File appDir = new File("src");
	File app = new File(appDir ,"General-Store.apk");
	DesiredCapabilities cap = new DesiredCapabilities();
	AndroidDriver<AndroidElement> driver;


	if(device.equals("real"))
	{
	    cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Device");
	}

	else 
	    cap.setCapability(MobileCapabilityType.DEVICE_NAME,"kanhaiya Emulator");
	
	
	

	cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

	//UI automator -> Android apps
	//uiautomator2

	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");

	driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);



	return driver;

    }

}
