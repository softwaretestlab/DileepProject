package StepDefinations;

import SeleniumCode.AT01_NavigateNTitleAssertScreenshot;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class SD01_NavigateToHNwebsite {
    @Given("open the browser and enter url and navigate to HN website")
    public void open_the_browser_and_enter_url_and_navigate_to_hn_website() throws IOException {
        AT01_NavigateNTitleAssertScreenshot.NavHN();
    }
    @Then("get the title and assert")
    public void get_the_title_and_assert() {
        AT01_NavigateNTitleAssertScreenshot.AsserTitle();
    }

}
