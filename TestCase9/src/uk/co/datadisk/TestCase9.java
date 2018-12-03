package uk.co.datadisk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase9 {

    // Testing Frames and Drag/Drop

    static final String BASE_URL = "http://jqueryui.com/droppable";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver cDriver =new ChromeDriver();
        cDriver.get(BASE_URL);

        // Identify the Frame
        System.out.println("Number of Frames: " + cDriver.findElements(By.tagName("iframe")).size());

        cDriver.switchTo().frame(cDriver.findElement(By.className("demo-frame")));
        cDriver.findElement(By.id("draggable")).click();

        // Now drag the source box to the destination box
        Actions actions = new Actions(cDriver);

        WebElement source_box = cDriver.findElement(By.id("draggable"));
        WebElement destination_box = cDriver.findElement(By.id("droppable"));

        actions.dragAndDrop(source_box, destination_box).build().perform();
    }
}
