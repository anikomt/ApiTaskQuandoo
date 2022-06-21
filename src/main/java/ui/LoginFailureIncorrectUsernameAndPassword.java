package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 * Test case name: Switched places for username and password
 * Status: Negative
 * Description: Logging in on a given form, providing incorrect username and incorrect password.
 * Presetting: Go to site with URL = http://the-internet.herokuapp.com/login
 * Input data:
 *      username = "alex"
 *      password = "NoPassword!"
 * Test steps:
 *      1. Input "alex" to username field
 *      2. Input "NoPassword!" to password field
 *      3. Press button "Login"
 * Expected results: Staying on the page with URL http://the-internet.herokuapp.com/login
 **/

public class LoginFailureIncorrectUsernameAndPassword {
    String loginUrl = "http://the-internet.herokuapp.com/login";
    String username = "alex";
    String password = "NoPassword!";
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
