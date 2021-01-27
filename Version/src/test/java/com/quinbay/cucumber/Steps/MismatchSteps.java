package com.quinbay.cucumber.Steps;

import Page.MismatchPage;
import Page.VersionPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MismatchSteps {

    WebDriver driver;
    MismatchPage mismatchPage;

    @Given("User must be on Microtracker Page")
    public void userMustBeOnMicrotrackerPage() {

        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("http://cloud-control-app.infra-sg.cld/microTracker");
        mismatchPage = new MismatchPage(driver);

        //file:///Users/selvaprince/Downloads/AssignmentNEW.htm

    }

    @When("User gives the two environment name {string} {string}")
    public void userGivesTheTwoEnvironmentNameEnviromentEnviroment(String string1, String string2) throws IOException {
        mismatchPage.findMisMatch(string1, string2);
    }

    @Then("The reults will be loaded")
    public void theReultsWillBeLoaded() {
        driver.close();
    }
}
