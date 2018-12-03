package uk.co.datadisk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class TestCase8 {

    // Multiple Windows and selecting a specific one

    static final String BASE_URL = "http://accounts.google.com/signup";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver cDriver =new ChromeDriver();
        cDriver.get(BASE_URL);

        // This will open another window
        cDriver.findElement(By.linkText("Help")).click();
        System.out.println(cDriver.getTitle());

        // Switch to other window, by default we get a Set back (getWindowHandles) but easier if we convert it to a List
        List<String> windowsList = new ArrayList<>(cDriver.getWindowHandles());
        cDriver.switchTo().window(windowsList.get(1));
        System.out.println(cDriver.getTitle());

        cDriver.switchTo().window(windowsList.get(0));
        System.out.println(cDriver.getTitle());
    }
}
