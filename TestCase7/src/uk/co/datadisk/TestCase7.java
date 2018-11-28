package uk.co.datadisk;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase7 {

    static final String BASE_URL = "http://amazon.com";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver cDriver =new ChromeDriver();
        cDriver.get(BASE_URL);

        // Below used to test id
        //cDriver.findElement(By.id("nav-link-accountList")).click();

        // move the mouse to a element, build it and run it (perform)
        Actions actions = new Actions(cDriver);
        actions.moveToElement(cDriver.findElement(By.id("nav-link-accountList"))).build().perform();

        // Enter HELLO in search box and select the text
        actions.moveToElement(cDriver.findElement(By.id("twotabsearchtextbox")))
                .click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

        // right-click
        actions.contextClick().build().perform();
    }
}
