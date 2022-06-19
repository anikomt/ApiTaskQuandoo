# Project
Test task for Quandoo.

# **Message to Quandoo team:**

# **Selected technology stack:**

- Java
- Selenium
- TestNG

# **Reasons behind the chosen framework and pattern(s):**

# **How to make the framework work and how to execute the test(s):**

All the tests are located in **TestTaskQuandoo** repository, branch **master**.

- UI test suite location path is **/src/main/java/ui**.

Each test includes comment section with a short description of the current test case. Please note that in the description "correct"/"incorrect" stand for data existing/not existing in the system for this specific task (e. g. "correct username" means username value provided in the http://the-internet.herokuapp.com/login page info, "incorrect username" means any other username value).
- API test location path is **/src/main/java/api**.

Test itself is located in the **E2ERegisterLoginSuccess.java** file.

# **Next possible steps for improvements:**

Currently success/failure status for UI tests is set based on the actual page URL present in the end of the test: 
- http://the-internet.herokuapp.com/login for failure
- http://the-internet.herokuapp.com/secure for success

This can be improved by adding checks of pop-up info messages, appearing after pressing "Login" button as well as adding checks for presence of specific elements of the page.

Other complex cases can be added:
-  providing SQL request in input fields;
-  provoding scripts in input fields;
-  providing html tags in input fields;
-  providing non-standart symbols (such as smiley) in input fields;
-  providing non-english letters in input fields;
-  check available data length of the input firelds;
-  check login features in different browsers;
-  check simultanious logging in in several browsers/browser pages.
