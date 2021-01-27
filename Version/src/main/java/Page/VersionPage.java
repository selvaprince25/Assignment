package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class VersionPage {

    WebDriver driver;

    public VersionPage(WebDriver webdriver) {
        driver = webdriver;
    }

    public void getAppName(String string) throws IOException {

        HashMap<String, Integer> environmentValue = new HashMap<String, Integer>();
        environmentValue.put("Qa1", 2);
        environmentValue.put("QA2", 3);
        environmentValue.put("Stg", 4);
        environmentValue.put("Prepod", 5);
        environmentValue.put("Prod", 6);

        int value = environmentValue.get(string);
        Date objDate = new Date();
        System.out.println(objDate);
        String strDateFormat = "dd MMM yyyy  hh:mm";
        SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);
        String obj = objSDF.format(objDate);
        System.out.println(obj);
        String filename = string + obj;
        FileWriter writer = new FileWriter("/Users/selvaprince/Downloads/" + filename + ".txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        for (int i = 1; i < 335; i++) {
            if (driver.findElement(By.xpath("//tr[" + i + "]//td[" + value + "]")).getText().equals("")) {
                bufferedWriter.write(driver.findElement(By.xpath("//tbody[@id='tableBody']//tr[" + i + "]//td[1]")).getText());
                bufferedWriter.newLine();
                System.out.println(driver.findElement(By.xpath("//tbody[@id='tableBody']//tr[" + i + "]//td[1]")).getText());
            }
        }
        bufferedWriter.close();
    }
}
