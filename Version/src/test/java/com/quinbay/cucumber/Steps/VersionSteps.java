package com.quinbay.cucumber.Steps;

import Page.VersionPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class VersionSteps {
    public static WebDriver driver;
    public VersionPage versionPage;

    @Given("User on Microtracker Page")
    public void user_on_microtrcker_page() {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("http://cloud-control-app.infra-sg.cld/microTracker");
        versionPage = new VersionPage(driver);


    }

    @When("User gives the environment name {string}")
    public void user_gives_the_environment_name(String string) throws IOException {

        versionPage.getAppName(string);

    }

    @Then("The user will land on result page")
    public void the_user_will_land_on_result_page() {
        driver.close();

    }


}
