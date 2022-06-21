package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 * Test case name: Successful login
 * Status: Positive
 * Description: Logging in on a given form, providing correct data for username and password.
 * Presetting: Go to site with URL = http://the-internet.herokuapp.com/login
 * Input data:
 *      username = "tomsmith"
 *      password = "SuperSecretPassword!"
 * Test steps:
 *      1. Input "tomsmith" to username field
 *      2. Input "SuperSecretPassword!" to password field
 *      3. Press button "Login"
 * Expected results: Redirected to the page with URL http://the-internet.herokuapp.com/secure
 **/

public class LoginSuccess {
    String loginUrl = "http://the-internet.herokuapp.com/login";
    String expectedUrl = "http://the-internet.herokuapp.com/secure";
    String username = "tomsmith";
    String password = "SuperSecretPassword!";

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
