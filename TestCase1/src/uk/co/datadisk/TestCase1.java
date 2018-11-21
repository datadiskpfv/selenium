package uk.co.datadisk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestCase1 {

    static final String BASE_URL = "http://www.google.com";

    public static void main(String[] args) {

        // Google Chrome Test

        // Set System property to point to chrome web driver (may need to download the web driver)
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");

        // Create the web driver
        WebDriver cDriver =new ChromeDriver();

        // Open the Chrome Driver and get the URL
        cDriver.get(BASE_URL);

        // get title of page
        System.out.println(cDriver.getTitle());

        // Looking at a few more Web Driver methods, will continue to use Chrome
        System.out.println(cDriver.getCurrentUrl());  // use to validate URL

        //System.out.println(cDriver.getPageSource());  // use to check for frames, etc in source code

        cDriver.get("http://yahoo.com");        // go to yahoo
        cDriver.navigate().back();              // hit the back button, you also have forward button

        cDriver.close();                        // close the current browser
        cDriver.quit();                         // close all open browsers used by selenium (child windows)

        // MicroSoft Edge Test

        //System.setProperty("webdriver.edge.driver","C:\\chromedriver_win32\\MicrosoftWebDriver.exe");
        //WebDriver eDriver = new EdgeDriver();
        //eDriver.get(BASE_URL);
        //System.out.println(eDriver.getTitle());
    }
}