package matches;

import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Matches extends MobileAPI {

    @FindBy (xpath = "//*[@id=\"selectedElementContainer\"]/div/div[2]/div/div[2]/div/div/div/div/div/table/tbody/tr/td[2]/text()")
    public WebElement Live;
    @FindBy (css = "#screenshotContainer > div > div > div > div > div > div._highlighter-box_619e8._inspected-element-box_619e8")
    public WebElement Upcoming;
    @FindBy (xpath = "//*[@id=\"screenshotContainer\"]/div/div/div/div/div/div[22]")
    public WebElement Recent;

    public void clickLiveButton(){
        Live.click();
        sleepFor(2);
    }
    public void clickUpcoming(){
        Upcoming.click();
        sleepFor(2);
    }
    public void clickRecent(){
        Recent.click();
        sleepFor(2);
    }
    public void setMatchesUp(){
        sleepFor(10);
        clickById("com.cricbuzz.android:id/tab_home");
        sleepFor(2);
        clickById("com.cricbuzz.android:id/tab_matches");
        sleepFor(2);
    }
}
