package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecoundSeleniumExample {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/suraj/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.close();
    }
}
