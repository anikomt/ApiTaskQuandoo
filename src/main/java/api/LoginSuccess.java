package api;

public class LoginSuccess {
    private String token;

    public LoginSuccess() {
    }

    public LoginSuccess(Integer id, String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}

