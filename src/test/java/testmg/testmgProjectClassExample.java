package testmg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testmgProjectClassExample {

        @Test
        public void testcase1() {
            System.setProperty("webdriver.chrome.driver", "C:/Users/suraj/Downloads/chromedriver_win32/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com");
            driver.close();


        }

        @Test
        public void testcase2() {
            System.setProperty("webdriver.chrome.driver", "C:/Users/suraj/Downloads/chromedriver_win32/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com");
            driver.close();

        }

        @Test
        public void testcase3() {
            System.setProperty("webdriver.chrome.driver", "C:/Users/suraj/Downloads/chromedriver_win32/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com");
            driver.close();

        }
    }

