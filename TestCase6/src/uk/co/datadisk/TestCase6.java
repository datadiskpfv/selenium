package uk.co.datadisk;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestCase6 {

    static final String BASE_URL = "https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL";

    public static void main(String[] args) {

        // SpiceJet drop box test
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver cDriver =new ChromeDriver();
        cDriver.get(BASE_URL);

        // an Implicit wait (This is global)
        cDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        cDriver.findElement(By.id("H-destination")).sendKeys("nyc");
        cDriver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
        cDriver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);

        cDriver.findElement(By.xpath("//a[contains(@href,'New-York-Hotels-The-Plaza-Hotel')]")).click();
    }
}
