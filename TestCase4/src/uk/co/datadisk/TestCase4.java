package uk.co.datadisk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase4 {

    // Selecting a Javascript popup and accepting

    static final String BASE_URL = "http://www.tizag.com/javascriptT/javascriptalert.php";

    public static void main(String[] args) {

        // SpiceJet drop box test
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver cDriver =new ChromeDriver();
        cDriver.get(BASE_URL);

        cDriver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();

        // Get text in pop up before we close it
        System.out.println(cDriver.switchTo().alert().getText());

        // Accept the popup (ok)
        cDriver.switchTo().alert().accept();

        // if pop up has cancel, use below to select that
        //cDriver.switchTo().alert().dismiss();
    }
}
