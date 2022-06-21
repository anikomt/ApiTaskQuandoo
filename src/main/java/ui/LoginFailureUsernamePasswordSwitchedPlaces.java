package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 * Test case name: Switched places for username and password
 * Status: Negative
 * Description: Logging in on a given form, providing correct username filled in password field and correct password filled in username filed.
 * Presetting: Go to site with URL = http://the-internet.herokuapp.com/login
 * Input data:
 *      username = "SuperSecretPassword!"
 *      password = "tomsmith"
 * Test steps:
 *      1. Input "SuperSecretPassword!" to username field
 *      2. Input "tomsmith" to password field
 *      3. Press button "Login"
 * Expected results: Staying on the page with URL http://the-internet.herokuapp.com/login
 **/

public class LoginFailureUsernamePasswordSwitchedPlaces {
    String loginUrl = "http://the-internet.herokuapp.com/login";
    String username = "SuperSecretPassword!";
    String password = "tomsmith";
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
