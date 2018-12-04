package uk.co.datadisk;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestCase10 {

    // Limiting web driver scope

    static final String BASE_URL = "http://qaclickacademy.com/practice.php";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver cDriver =new ChromeDriver();
        cDriver.get(BASE_URL);

        // Limiting web driver scope
        WebElement footerDriver = cDriver.findElement(By.id("gf-BIG"));
        System.out.println(footerDriver.findElements(By.tagName("a")).size());

        // get the number of links in the first column
        WebElement columnFooterDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(columnFooterDriver.findElements(By.tagName("a")).size());

        // loop through the links and open in separate tabs
        for(int i=1; i < columnFooterDriver.findElements(By.tagName("a")).size(); i++){
            // will open links in separate tabs
            String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
            columnFooterDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
        }

        // loop through each tab and get title
        List<String> windowsList = new ArrayList<>(cDriver.getWindowHandles());
        Iterator<String> it = windowsList.iterator();
        while(it.hasNext()){
            cDriver.switchTo().window(it.next());
            System.out.println(cDriver.getTitle());
        }

        // return to first tab (index 0)
        cDriver.switchTo().window(windowsList.get(0));
    }
}
