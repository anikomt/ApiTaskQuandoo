package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 * Test case name: Empty password field
 * Status: Negative
 * Description: Logging in on a given form, providing correct username and empty input for password.
 * Presetting: Go to site with URL = http://the-internet.herokuapp.com/login
 * Input data:
 *      username = "tomsmith"
 *      password is absent (empty input)
 * Test steps:
 *      1. Input "tomsmith" to username field
 *      2. Input empty data to password field
 *      3. Press button "Login"
 * Expected results: Staying on the page with URL http://the-internet.herokuapp.com/login
 **/

public class LoginFailureEmptyPassword {
    String loginUrl = "http://the-internet.herokuapp.com/login";
    String username = "tomsmith";
    String password = "";
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
