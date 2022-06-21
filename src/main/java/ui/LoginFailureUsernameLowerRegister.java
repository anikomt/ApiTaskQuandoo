package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 * Test case name: Username starts with a blank space
 * Status: Negative
 * Description: Logging in on a given form, providing correct username and correct password starting with a lower register letter.
 * Presetting: Go to site with URL = http://the-internet.herokuapp.com/login
 * Input data:
 *      username = "tomsmith"
 *      password = "superSecretPassword!"
 * Test steps:
 *      1. Input "tomsmith" to username field
 *      2. Input "superSecretPassword!" to password field
 *      3. Press button "Login"
 * Expected results: Staying on the page with URL http://the-internet.herokuapp.com/login
 **/

public class LoginFailureUsernameLowerRegister {
    String loginUrl = "http://the-internet.herokuapp.com/login";
    String username = "tomsmith";
    String password = "superSecretPassword!";
    String expectedUrl = loginUrl;

    WebDriver driver = new FirefoxDriver();

    @Test
    public void test(){
        InputLoginData.input(driver, loginUrl, username, password, expectedUrl);
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
