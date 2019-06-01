import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends MobileAPI {

    @FindBy(id = "com.cricbuzz.android:id/tab_videos")
    public WebElement videosFooterButton;
    @FindBy(id = "com.cricbuzz.android:id/tab_more")
    public WebElement moreFooterButton;


    public void clickVideoFooterButton(){
        videosFooterButton.click();
        sleepFor(2);
    }
    public void clickMoreFooterButton(){
        moreFooterButton.click();
        sleepFor(2);
    }

}
