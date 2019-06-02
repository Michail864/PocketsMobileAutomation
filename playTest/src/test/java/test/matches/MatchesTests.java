package test.matches;

import base.MobileAPI;
import matches.Matches;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MatchesTests extends MobileAPI {

    public Matches matches;
    @BeforeMethod

    public void init() {
        matches = PageFactory.initElements(driver, Matches.class);
    }

    //Testcase 1. --

    public void testLiveclick(){
        matches.setMatchesUp();
        matches.clickLiveButton();
    }

    //Testcase 2. --

    @Test
    public void testUpcomingclick(){
        matches.setMatchesUp();
        matches.clickUpcoming();
    }


    //Testcase 3. --

    public void testRecentClick(){
        matches.setMatchesUp();
        matches.clickRecent();
    }



}
