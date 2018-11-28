package uk.co.datadisk;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase6 {

    // Using implicit and explicit waits

    static final String BASE_URL = "https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver cDriver =new ChromeDriver();
        cDriver.get(BASE_URL);

        // an Implicit wait (This is global)
        //cDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        cDriver.findElement(By.id("H-destination")).sendKeys("The Ritz-Carlton New York");
        cDriver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
        cDriver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);


        // Explicit wait (wait for a period of time something to appear)
        WebDriverWait d = new WebDriverWait(cDriver, 5);
        d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'New-York-Hotels-The-Ritz')]")));
        cDriver.findElement(By.xpath("//a[contains(@href,'New-York-Hotels-The-Ritz')]")).click();
    }
}