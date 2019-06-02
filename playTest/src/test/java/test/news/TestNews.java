package test.news;

import base.MobileAPI;
import news.NewsMobile;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TestNews extends MobileAPI {
    public NewsMobile news;

    @BeforeMethod

    public void init(){
        news = PageFactory.initElements(driver,NewsMobile.class);
    }

    //Testcase 1. --


    public void testAllStoriesClicks(){
        news.setUpNews();
        news.clickAllStories();
        List<WebElement> elements = driver.findElements(By.className("android.widget.TextView"));
        for(WebElement element : elements){
            element.click();
            sleepFor(2);
            driver.navigate().back();
            sleepFor(2);
        }
    }

    //Testcase 2. --

    @Test

    public void testCategoriesClicks(){
        news.setUpNews();
        news.clickCategories();
        List<WebElement> elements = driver.findElements(By.className("android.widget.LinearLayout"));
        for(WebElement element : elements){
            element.click();
            sleepFor(2);
            driver.navigate().back();
            sleepFor(2);
        }
    }

    //Testcase 3. --


    public void testTopicsClicks(){
        news.setUpNews();
        news.clickTopics();
        List<WebElement> elements = driver.findElements(By.className("android.widget.LinearLayout"));
        for(WebElement element : elements){
            element.click();
            sleepFor(2);
            driver.navigate().back();
            sleepFor(2);
        }
    }

}
