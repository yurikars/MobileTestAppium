import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;

public class MobileApkTest
{
    @Test
    public void northWellTest () throws Exception {
        URL serverURL = new URL("http://127.0.0.1:4723/wd/hub");
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"6.0");


        capabilities.setCapability("appPackage","io.appery.project515259");
        capabilities.setCapability("appActivity","io.appery.project515259.MainActivity");

        AppiumDriver driver = new AndroidDriver(serverURL, capabilities);
        WebDriverWait wait = new WebDriverWait(driver, 30);

        System.out.println("Step 1: Enter login");

        driver.findElement(By.name(""));

        System.out.println("Step 2: Enter password");
        driver.findElement(By.name(""));

        System.out.println("Step 3: Click login button");
        driver.findElement(By.name("")).click();

        System.out.println ("Step 7: Close driver");
        //driver.quit();
    }
}
