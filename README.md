# Project

Test task for Quandoo.

# **Message to Quandoo team**

I would like to sincerely thank you for the given opportunity to show my skills.
I enjoyed the time spent on executing the task and find it very usefull and educating for myself!
I read more into automation testing and tried different approaches to complete the task in a better way, however I understand it is still not perfect, so **I would really appreciate if you provide me tips and comments on how to improve my work.**
I hope I will have a chance to talk to you in person and show my motivation to work in Quandoo!

Kindly note that as the UI task description says "_Design a test suite for **login functionality**_" I concentrated on implementing corresponding test cases, meanwhile there are other page objects and functionality features (such as "Logout" button for example) that can be tested, so just let me know if those test cases should be implemented as well and I will add them.

API task can also be implemented in different ways, so if it should be done in other way from what I've done, let me know as well, so I can change it.
My solution can be described by the following flow:
- Use data of `GET` SINGLE USER request (`"email": "janet.weaver@reqres.in"`) as user email value for register/login requests;
- Register user sending `POST` REGISTER - SUCCESSFUL request using `"email": "janet.weaver@reqres.in"` and save the returned token;
- Log in user sending `POST` LOGIN - SUCCESSFUL request using `"email": "janet.weaver@reqres.in"` and save the returned token;
- Compare that returned tokens from two previous steps are equal. 

# **Selected technology stack:**

- Java
- Selenium
- JUnit
- TestNG
- REST Assured

# **Reasons behind the chosen framework and pattern(s)**

I decided to use these technologies, because I'm more familiar with them and need less time to complete the task, however I'm also able to re-write tests on Python instead of Java. For simple tests these technologies are fitting good, but for more complex tasks necessity of using other technologies should be considered, in terms of usability and optimisation, for example.

# **How to make the framework work and how to execute the test(s)**

All the tests are located in **TestTaskQuandoo** repository, branch **master**.

- UI test suite location path is **/src/main/java/ui**.

Each test includes comment section with a short description of the current test case. Please note that in the description "correct"/"incorrect" stand for data existing/not existing in the system for this specific task (e. g. "correct username" means username value provided in the http://the-internet.herokuapp.com/login page info, "incorrect username" means any other username value).

- API test location path is **/src/main/java/api**.

Test itself is located in the **E2ERegisterLoginSuccess.java** file.

# **Next possible steps for improvements**

Currently success/failure result status for UI tests is set based on the actual page URL open by the end of the test: 
- http://the-internet.herokuapp.com/login URL for failure
- http://the-internet.herokuapp.com/secure URL for success

This can be improved by adding checks of pop-up info messages, appearing after pressing "Login" button, as well as adding checks for presence of specific elements of the page.

Other complex test cases can be added:
-  providing SQL request in input fields;
-  providing scripts in input fields;
-  providing html tags in input fields;
-  providing non-standart symbols (such as smiley) in input fields;
-  providing non-english letters in input fields;
-  check available data length of the input firelds;
-  check login features in different browsers;
-  check simultanious logging in in several browsers/browser pages.

For API task improvement I would consider adding negative cases and adding `GET` SINGLE USER request to get the user data (right now the test only includes `POST` requests).

In addition code refactoring and naming refactoring should be applied for both UI and API tasks.
