package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class AT01_NavigateTitleAssertScreenshot {

    @Test
    public void NavigateGG() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.harveynorman.com.au/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String ExpectedTitle = "Computers, Electrical, Furniture & Bedding | Harvey Norman Australia";
        String ActualTitle = driver.getTitle();
        System.out.println("ActualTitle : "+ActualTitle);
        //Assertion Version-1 [here we are trying to match expected to actual]
       // Assert.assertEquals(ExpectedTitle,ActualTitle);
        //Assertion Version-2 [here we are checking for a specific value from entire title to match]
      //  Assert.assertTrue(ActualTitle.contains("Furniture"));
        //Screenshot
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("C:\\Users\\softw\\screenshot.png"));


    }
}
