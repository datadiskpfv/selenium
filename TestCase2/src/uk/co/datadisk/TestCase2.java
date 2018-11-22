package uk.co.datadisk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

    // Finding an element and enter data into it

    static final String BASE_URL = "http://facebook.com";

    public static void main(String[] args) {

        // Facebook email locator test
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver cDriver =new ChromeDriver();
        cDriver.get(BASE_URL);

        // find the email box element and type email address in it
        cDriver.findElement(By.id("email")).sendKeys("paul.valle@datadisk.co.uk");

        // find another element and enter data into it (password field)
        cDriver.findElement(By.id("pass")).sendKeys("password");

        // find element using xPath
        cDriver.findElement(By.name("firstname")).sendKeys("Hello");

        // Get and grab text from the web page, you can then check it
        System.out.println(cDriver.findElement(By.xpath("//div[@class='_5iyx']")).getText().contains("helps you connect and share"));

        // click a link
        cDriver.findElement(By.linkText("Forgotten account?")).click();
    }
}