import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;

public class MobileWebTest
{
    @Test
    public void testIncorrectFBLogin () throws Exception {
        URL serverURL = new URL("http://127.0.0.1:4723/wd/hub");
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"6.0.1");

        //capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
        capabilities.setCapability("appPackage","io.appery.project515259");
        capabilities.setCapability("appActivity","io.appery.project515259.MainActivity");
        //capabilities.setCapability((MobileCapabilityType.BROWSER_VERSION, "latest");
        //capabilities.setCapability(MobileCapabilityType.FULL_RESET, true);

        System.out.println ("Step 1: Create new driver");
        AppiumDriver driver = new AndroidDriver(serverURL, capabilities);
        WebDriverWait wait = new WebDriverWait(driver, 30);

        System.out.println ("Step 2: Open website");
        driver.get("https://facebook.com");

        System.out.println ("Step 3: Enter login");
        driver.findElement(By.name("email")).sendKeys("max@test.com");

        System.out.println ("Step 4: Enter password");
        driver.findElement(By.name("pass")).sendKeys("12345");

        System.out.println ("Step 5: Click login button");
        driver.findElement(By.name("login")).click();

        //System.out.println ("Step 6: Error message check");
        //Assert.assertTrue(driver.findElement(By.cssSelector("div[data-sigil='m_login_notice']")).getText().contains("The password you entered is incorrect. "));

        System.out.println ("Step 7: Close driver");
        driver.quit();
    }
}