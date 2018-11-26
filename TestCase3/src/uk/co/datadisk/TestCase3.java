package uk.co.datadisk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class TestCase3 {

    // Finding an element and enter data into it

    static final String BASE_URL = "http://spicejet.com";

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1200,800");

        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability(ChromeOptions.CAPABILITY, options);

        // SpiceJet drop box test
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver cDriver =new ChromeDriver(cap);
        cDriver.get(BASE_URL);

        // select static drop down
        Select s = new Select(cDriver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));

        // multiple ways to select an option in a drop box
        //s.selectByValue("USD");
        //s.selectByIndex(3);
        s.selectByVisibleText("USD");

        // departure drop down
        cDriver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
        cDriver.findElement(By.xpath("//a[@value='GOI']")).click();
    }
}