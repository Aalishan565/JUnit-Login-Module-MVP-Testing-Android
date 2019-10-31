package com.example.junittesting;

public class LoginPresenterImpl implements LoginPresenter {

    private LoginViewListener loginViewListener;

    public LoginPresenterImpl(LoginViewListener loginViewListener) {
        this.loginViewListener = loginViewListener;
    }

    @Override
    public void doLogin(String userName, String password) {
        LoginService loginService = new LoginService();
        if (userName.isEmpty()) {
            loginViewListener.showUsernameError(R.string.username_error);
            return;
        } else if (password.isEmpty()) {
            loginViewListener.showPasswordError(R.string.password_error);
            return;
        } else if (loginService.login(userName, password)) {
            loginViewListener.startMainActivity();
        } else {
            loginViewListener.showLoginError(R.string.login_failed);
        }
    }
}
