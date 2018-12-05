package uk.co.datadisk;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase12 {

    static final String BASE_URL = "https://www.ksrtc.in/oprs-web";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver cDriver =new ChromeDriver();
        cDriver.get(BASE_URL);

        cDriver.findElement(By.id("fromPlaceName")).click();
        cDriver.findElement(By.id("fromPlaceName")).sendKeys("BENG");

        JavascriptExecutor js = (JavascriptExecutor)cDriver;

        String script = "return document.getElementById(\"fromPlaceName\").value;";
        String text = (String) js.executeScript(script);
        int count = 0;

        while(!text.contains("AIPORT")){
            cDriver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
            text = (String) js.executeScript(script);
            count++;

            if(count > 10){
                System.out.println("Maximum 10 limit hit");
                text = "element not found";
                break;
            }
        }

        cDriver.switchTo().defaultContent();
        cDriver.findElement(By.id("toPlaceName")).click();
        System.out.println(text);
        System.out.println("FINISHED");
    }
}
