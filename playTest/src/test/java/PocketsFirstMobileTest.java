import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class PocketsFirstMobileTest extends MobileAPI {

    @Test

    public void firstTestSettings(){
        sleepFor(10);
        driver.findElement(By.id("com.cricbuzz.android:id/img_action_settings")).click();
        sleepFor(5);
    }
}
