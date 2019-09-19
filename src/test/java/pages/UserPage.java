package test.java.pages;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class UserPage extends BasePage {

    static String controlItem;
    public static String title = "Login example page to test the PHP MySQL online system";
    public static String statusMessageFirst = "No login attempted";
    public static String statusMessageFailed = "**Failed Login**";
    public static String statusMessageSuccess = "Successful Login";
    public static String correctUsermame = "testuser";
    public static String correctPassword = "testpass";
    public static String uncorrectUsername = "wrong";
    public static String uncorrectPassword = "wrong";

    public static By pageTitleCss = By.xpath("/html/body/table/tbody/tr/td[1]/p/big/strong");
    public static By statusMessage = By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b");
    public static By userNameField = By.cssSelector("input[name='username']");
    public static By passwordField = By.cssSelector("input[type='password']");
    public static By testButton = By.cssSelector("input[type='button']");


    public static void openHepsiburada(){
        driver.get("http://php.thedemosite.co.uk/login.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOfElementLocated(userNameField));
    }

    public static void tabTitle(){
        driver.getTitle().equals(title);
    }

    public static void pageTitle(){
        driver.findElement(pageTitleCss).equals("4. Login");
    }

    public static void enterUsername(String username){
       // driver.switchTo().alert().accept();
        try {
            WebDriverWait wait = new WebDriverWait(driver, 2);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            System.out.println(alert.getText());
            alert.accept();
            Assert.assertTrue(alert.getText().contains("Thanks."));
        } catch (Exception e) {
            //exception handling
        }
        driver.findElement(userNameField).click();
        driver.findElement(userNameField).clear();
        driver.findElement(userNameField).sendKeys(username);
    }

    public static void enterPassword(String password){
        driver.findElement(passwordField).click();
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
    }

    public static void clickTestButton(){
        driver.findElement(testButton).click();
    }

    public static void controllStatusMessage(String message){
        controlItem = driver.findElement(statusMessage).getText();
        System.out.println(controlItem);
        Assert.assertTrue(controlItem.contains(message));
    }

    //public static void (){}

    public UserPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

}