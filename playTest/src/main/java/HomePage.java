import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends MobileAPI{

    @FindBy(id = "com.cricbuzz.android:id/tab_videos")
    public WebElement videosFooterButton;
    @FindBy(id = "com.cricbuzz.android:id/tab_more")
    public WebElement moreFooterButton;
    @FindBy(id = "com.cricbuzz.android:id/txt_team1")
    public WebElement team1;

    @FindBy (xpath = "(//android.widget.ImageView[@content-desc=\"image\"])[2]")
    public WebElement video1;
    @FindBy (xpath = "(//android.widget.ImageView[@content-desc=\"image\"])[4]")
    public WebElement video2;



    public void clickVideoFooterButton(){
        videosFooterButton.click();
        sleepFor(2);
    }
    public void clickMoreFooterButton(){
        moreFooterButton.click();
        sleepFor(2);
    }
    public void clickVideo1Button(){
        video1.click();
        sleepFor(2);
    }
    public void clickVideo2FButton(){
        video2.click();
        sleepFor(2);
    }
    public void clickTeam1(){
        team1.click();
        sleepFor(2);
    }

}