package base;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileAPI  {



        public AppiumDriver driver;
        public WebDriverWait wait;

        @BeforeMethod

        public WebDriver setUpAppium () throws MalformedURLException {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("deviceName", "PIXEL 2 API 28");
            caps.setCapability("id", "emulator-5554");
            caps.setCapability("platformName", "android");
            caps.setCapability("platformVersion", "9");
            caps.setCapability("app", "C:\\\\Users\\\\wormi\\\\Downloads\\\\Cricbuzz Live Cricket Scores News_v4.5.002_apkpure.com(3).apk");
            caps.setCapability("noReset","false");
            driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            wait = new WebDriverWait(driver, 10);
            return driver;

        }

        public void sleepFor(int sec){
            try {
                Thread.sleep(sec * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public void clickByXpath(String locator) {
            driver.findElement(By.xpath(locator)).click();
        }
        public void clickById(String locator) {
            driver.findElement(By.id(locator)).click();
        }
    }

