package test.java.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ParentFunctions {

    public WebDriver driver;
    public WebDriverWait wait;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\omer\\Desktop\\OtomasyonWorkspace\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 30);
        driver.manage().window().maximize();
    }

    public void tearDown(){
        driver.quit();
    }
}
