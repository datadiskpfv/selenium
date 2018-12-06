package uk.co.datadisk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase15 {

    // Maximize the browser window and delete cookies

    static final String BASE_URL = "http://www.datadisk.co.uk";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");

        // we add the Chrome options with the capabilities into the driver
        WebDriver cDriver =new ChromeDriver();

        // maximize the browser window
        cDriver.manage().window().maximize();

        // delete all the cookies (use deleteCookieNamed for specific cookies)
        cDriver.manage().deleteAllCookies();

        cDriver.get(BASE_URL);

    }
}