package Page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class MismatchPage {

    WebDriver driver;
    private FileWriter Users;
    private FileWriter Downloads;

    public MismatchPage(WebDriver webdriver) {
        driver = webdriver;
    }

    public void findMisMatch(String string1, String string2) throws IOException {

        HashMap<String, Integer> environmentValue = new HashMap<String, Integer>();
        environmentValue.put("Qa1", 2);
        environmentValue.put("QA2", 3);
        environmentValue.put("Stg", 4);
        environmentValue.put("Prepod", 5);
        environmentValue.put("Prod", 6);




        int value1 = environmentValue.get(string1), value2 = environmentValue.get(string2);
        for (int i = 1; i < 335; i++) {
                if (!(driver.findElement(By.xpath("//tr[" + i + "]//td[" + value1 + "]")).getText().equals(driver.findElement(By.xpath("//tr[" + i + "]//td[" + value2 + "]")).getText()))) {
                    System.out.println(driver.findElement(By.xpath("//tbody[@id='tableBody']//tr[" + i + "]//td[1]")).getText());


//
//                    br.write(driver.findElement(By.xpath("//tbody[@id='tableBody']//tr[" + i + "]//td[1]")).getText());
//                    br.newLine();
//
//
//                    br.close();
                }

        }


    }
}
