package com.quinbay.cucumber.Steps;

import Page.SnapshotsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SnapshotsSteps {
    WebDriver driver;
    SnapshotsPage snapshotsPage;
    @Given("User should be in the Microtracker Page")
    public void user_should_be_in_the_microtracker_page() {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("http://cloud-control-app.infra-sg.cld/microTracker");
        snapshotsPage=new SnapshotsPage(driver);
    }

    @When("User gives the environment name as {string}")
    public void user_gives_the_environment_name_as(String string) throws IOException {
        snapshotsPage.misMatch(string);


    }

    @Then("User will land on the result page")
    public void user_will_land_on_the_result_page() {
       // driver.close();

    }



}
