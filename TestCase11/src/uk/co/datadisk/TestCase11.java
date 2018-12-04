package uk.co.datadisk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestCase11 {

    // Calendars

    static final String BASE_URL = "https://www.path2usa.com/travel-companions";
    static final String MonthYear = "March 2019";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver cDriver =new ChromeDriver();
        cDriver.get(BASE_URL);

        // get the travel date element
        cDriver.findElement(By.cssSelector("#travel_date")).click();
        List<WebElement> dates = cDriver.findElements(By.className("day"));
        System.out.println("Number of Dates: " + dates.size() + "\n");

        WebElement datepickerDays = cDriver.findElement(By.className("datepicker-days"));
        WebElement datepickerSwitch = datepickerDays.findElement(By.className("datepicker-switch"));
        WebElement nextMonth = datepickerDays.findElement(By.className("next"));

        while(!datepickerSwitch.getText().equals(MonthYear)){
            nextMonth.click();
        }


        // get all dates and loop through until you find a date that you need
//        System.out.println("List Dates");
//        System.out.println("==============================");
//        for (int i = 0; i < dates.size(); i++) {
//            System.out.println(dates.get(i).getText());
//            if(dates.get(i).getText().equals("23")){
//                dates.get(i).click();
//                break;
//            }
//        }
    }
}
