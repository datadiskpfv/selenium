package uk.co.datadisk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase13 {

    static final String BASE_URL = "http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver cDriver =new ChromeDriver();
        cDriver.get(BASE_URL);

        WebElement table = cDriver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
        int rowcount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
        int scoresCount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size() - 2;

        System.out.println("Row count: " + rowcount);
        System.out.println("Scores count: " + scoresCount);

        Integer total = 0;

        for (int i = 0; i < scoresCount; i++) {
            String score = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
            System.out.println(score);

            total += Integer.parseInt(score);
        }

        String extras = cDriver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
        total += Integer.parseInt(extras);

        System.out.println("Total: " + total);
    }
}
