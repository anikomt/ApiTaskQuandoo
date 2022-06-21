package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 * Test case name: Switched places for username and password
 * Status: Negative
 * Description: Logging in on a given form, providing correct, but shortened username ("tom" instead of "tomsmith") and correct password.
 * Presetting: Go to site with URL = http://the-internet.herokuapp.com/login
 * Input data:
 *      username = "tom"
 *      password = "SuperSecretPassword!"
 * Test steps:
 *      1. Input "tom" to username field
 *      2. Input "SuperSecretPassword!" to password field
 *      3. Press button "Login"
 * Expected results: Staying on the page with URL http://the-internet.herokuapp.com/login
 **/

public class LoginFailureShortenedUsername {
    String loginUrl = "http://the-internet.herokuapp.com/login";
    String username = "tom";
    String password = "SuperSecretPassword!";
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
