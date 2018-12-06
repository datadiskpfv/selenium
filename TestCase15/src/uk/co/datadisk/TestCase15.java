package uk.co.datadisk;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class TestCase15 {

    // Maximize the browser window, delete cookies, screenshots

    static final String BASE_URL = "http://www.datadisk.co.uk";

    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");

        // we add the Chrome options with the capabilities into the driver
        WebDriver cDriver =new ChromeDriver();

        // maximize the browser window
        cDriver.manage().window().maximize();

        // delete all the cookies (use deleteCookieNamed for specific cookies)
        cDriver.manage().deleteAllCookies();
        //cDriver.manage().deleteCookieNamed("<cookie name>");

        cDriver.get(BASE_URL);

        // capture a screenshot
        File src = ((TakesScreenshot) cDriver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\pvalle\\Pictures\\screenshot.png"));
    }
}