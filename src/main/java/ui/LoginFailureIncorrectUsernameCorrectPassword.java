package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

/**
 * Test case name: Switched places for username and password
 * Status: Negative
 * Description: Logging in on a given form, providing incorrect username and correct password.
 * Presetting: Go to site with URL = http://the-internet.herokuapp.com/login
 * Input data:
 *      username = "alex"
 *      password = "SuperSecretPassword!"
 * Test steps:
 *      1. Input "alex" to username field
 *      2. Input "SuperSecretPassword!" to password field
 *      3. Press button "Login"
 * Expected results: Staying on the page with URL http://the-internet.herokuapp.com/login
 **/

public class LoginFailureIncorrectUsernameCorrectPassword {
    public static void main(String[] args){
        String loginUrl = "http://the-internet.herokuapp.com/login";
        String username = "alex";
        String password = "SuperSecretPassword!";

        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(loginUrl);

        WebElement usernameElement = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement passwordElement = driver.findElement(By.xpath("//input[@name='password']"));
        WebElement loginButtonElement = driver.findElement(By.xpath("//button[@type='submit']"));

        usernameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginButtonElement.click();

        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(loginUrl, actualUrl);
    }
}
