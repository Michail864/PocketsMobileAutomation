import base.MobileAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class PocketsFirstMobileTest extends MobileAPI {
    public HomePage homePage;

    @BeforeMethod

    public void init(){
        homePage = PageFactory.initElements(driver, HomePage.class);

    }


    //Test case 1--
    public void firstTestSettings(){
        sleepFor(10);
        clickById("com.cricbuzz.android:id/tab_home");
        sleepFor(2);
        driver.findElement(By.id("com.cricbuzz.android:id/img_action_settings")).click();
        sleepFor(2);
    }

    //Test case 2--

    public void matchesClick(){
        sleepFor(10);
        clickById("com.cricbuzz.android:id/tab_home");
        sleepFor(2);
        clickById("com.cricbuzz.android:id/tab_matches");
        sleepFor(2);
    }


    //Test case 3--

    public void teamClick(){
        sleepFor(10);
        clickById("com.cricbuzz.android:id/tab_home");
        sleepFor(2);
        clickById("com.cricbuzz.android:id/txt_team1");
        sleepFor(2);
    }

    //Test case 4--


    public void videosClickTest(){
        sleepFor(10);
        clickById("com.cricbuzz.android:id/tab_home");
        sleepFor(2);
        homePage.clickVideoFooterButton();
        sleepFor(2);
    }

    //Test case 5--


    public void moreClickTest(){
        sleepFor(10);
        clickById("com.cricbuzz.android:id/tab_home");
        sleepFor(2);
        homePage.clickMoreFooterButton();
        sleepFor(2);

    }

    //Test case 6--

    public void video1ClickTest(){
        sleepFor(10);
        clickById("com.cricbuzz.android:id/tab_home");
        sleepFor(2);
        homePage.clickVideo1Button();
        sleepFor(2);

    }

    //Test case 7--

    public void video2ClickTest(){
        sleepFor(10);
        clickById("com.cricbuzz.android:id/tab_home");
        sleepFor(2);
        homePage.clickVideo2FButton();
        sleepFor(2);
    }

    //Test case 8--

    public void team1ClickTest(){
        sleepFor(10);
        clickById("com.cricbuzz.android:id/tab_home");
        sleepFor(2);
        homePage.clickTeam1();
        sleepFor(2);

    }

}
