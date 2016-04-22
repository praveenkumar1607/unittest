package Unit;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class UnitTesting {
	WebDriver driver;
  @Test
  public void f() throws MalformedURLException {
	// File appDir = new File("http:\\192.168.1.40:9999\\jenkins\\job\\ciIntegration\\lastSuccessfulBuild\\artifact\\app\\build\\outputs\\apk");
			 // File app = new File(appDir, "app-debug.apk");
			  DesiredCapabilities cap=new DesiredCapabilities();
				 cap.setCapability("deviceName","J668A1ZR5B101972");
				 cap.setCapability("browserName","Android");
				 cap.setCapability("platformVersion","5.1");
				 cap.setCapability("platformName","Android");
				 //cap.setCapability("app", "http://192.168.1.40:9999/jenkins/job/ciIntegration/lastSuccessfulBuild/artifact/app/build/outputs/apk/app-debug.apk");
				 System.out.println("installing app on device from jenkins workspace");
				 cap.setCapability("appPackage","com.example.android.testing.unittesting.BasicSample");
			     cap.setCapability("appActivity","com.example.android.testing.unittesting.BasicSample.MainActivity");
				driver=new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
				 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				 System.out.println("apk installed");
				 
				 driver.findElement(By.name("Enter your name")).clear();
			     driver.findElement(By.name("Enter your name")).sendKeys("ashok");
			     driver.findElement(By.name("Enter your Email")).sendKeys("ashok.blisslogix@gmail.com");
			     driver.findElement(By.name("Save")).click();
				 driver.quit();
				 //driver.findElement(By.name("Sign Up")).click();
  }
}
