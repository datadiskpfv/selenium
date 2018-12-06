package uk.co.datadisk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestCase14 {

    // SSL Certificates

    static final String BASE_URL = "www.datadisk.co.uk";

    public static void main(String[] args) {

        // Setting up the Chrome desiredCapabilities (there are lots of capabilities)
        DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
        //desiredCapabilities.acceptInsecureCerts();

        desiredCapabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        desiredCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

        // Merge the above capabilities into Chrome
        ChromeOptions cOptions = new ChromeOptions();
        cOptions.merge(desiredCapabilities);

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");

        // we add the Chrome options with the capabilities into the driver
        WebDriver cDriver =new ChromeDriver(cOptions);

        cDriver.get(BASE_URL);

    }
}
