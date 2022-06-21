package api;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class E2ERegisterLoginSuccess {
    private final static String URL = "https://reqres.in/";

    public RegisterSuccess registerSuccess(){
        Specification.installSpecification(Specification.requestSpecification(URL), Specification.responseSpecification());

        Register registerUser = new Register("janet.weaver@reqres.in","pistol");
        RegisterSuccess registerSuccess = given()
                .body(registerUser)
                .when()
                .post("api/register")
                .then().log().all()
                .extract().as(RegisterSuccess.class);
        return registerSuccess;
    }

    public LoginSuccess loginSuccess(){
        Specification.installSpecification(Specification.requestSpecification(URL), Specification.responseSpecification());

        Login loginUser = new Login("janet.weaver@reqres.in","pistol");
        LoginSuccess loginSuccess = given()
                .body(loginUser)
                .when()
                .post("api/login")
                .then().log().all()
                .extract().as(LoginSuccess.class);
        return loginSuccess;
    }

    @Test
    public void Check() {
        E2ERegisterLoginSuccess testRegisterLoginSuccess = new E2ERegisterLoginSuccess();
        RegisterSuccess registerSuccess = testRegisterLoginSuccess.registerSuccess();
        LoginSuccess loginSuccess = testRegisterLoginSuccess.loginSuccess();
        Assert.assertEquals(registerSuccess.getToken(), loginSuccess.getToken());
    }
}



