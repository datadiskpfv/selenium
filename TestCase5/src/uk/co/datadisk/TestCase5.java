package uk.co.datadisk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase5 {

    // handling Forms

    static final String BASE_URL = "https://www.makemytrip.com";

    public static void main(String[] args) throws Exception {

        // SpiceJet drop box test
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver cDriver =new ChromeDriver();
        cDriver.get(BASE_URL);

        cDriver.findElement(By.xpath("//label[@class='label_text flight-trip-type']")).click();
        System.out.println(cDriver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed());

        cDriver.findElement(By.xpath("//label[contains(text(),'multi-city')]")).click();
        System.out.println(cDriver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed());

        cDriver.findElement(By.xpath("//input[@id='hp-widget__depart']")).click();

        // need a sleep due to popup taking a bit of time to load
        Thread.sleep(1000L);

        // you can get first of second elements for a specific date (text)
        // cDriver.findElement(By.linkText("29")).click();          // first 29
        cDriver.findElements(By.linkText("29")).get(1).click();     // second 29



    }
}
