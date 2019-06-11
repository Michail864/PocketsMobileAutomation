package test.videos;

import base.MobileAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import videos.Videos;

import java.util.List;

public class VideosTest extends MobileAPI {

    public Videos videos;

    @BeforeMethod
    public void init(){
        videos = PageFactory.initElements(driver, Videos.class);
    }

    //Testcase 1 --

    public void testVideosLive(){
        videos.videosSetUP();
        videos.clickCricLive();
        List<WebElement> elements = driver.findElements(By.xpath("(//android.widget.ImageView[@content-desc=\"image\"])"));
        sleepFor(2);
        for(WebElement element : elements){
            element.click();
            sleepFor(2);
            driver.navigate().back();
        }
    }

    //Testcase 2 --

    public void testVideosCricHindi(){
        videos.videosSetUP();
        videos.clickCricHindi();
        List<WebElement> elements = driver.findElements(By.xpath("(//android.widget.ImageView[@content-desc=\"image\"])"));
        sleepFor(2);
        for(WebElement element : elements){
            element.click();
            sleepFor(2);
            driver.navigate().back();
        }
    }

    //Testcase 3 --

    public void testVideosPressConf(){
        videos.videosSetUP();
        videos.clickPressConf();
        List<WebElement> elements = driver.findElements(By.xpath("(//android.widget.ImageView[@content-desc=\"image\"])"));
        sleepFor(2);
        for(WebElement element : elements){
            element.click();
            sleepFor(2);
            driver.navigate().back();
        }
    }

}
