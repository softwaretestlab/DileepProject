package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AT01_NavigateTitleAssertScreenshot {

    @Test
    public void NavigateGG(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
    }
}
