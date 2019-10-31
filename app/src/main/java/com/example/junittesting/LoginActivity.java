package com.example.junittesting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class LoginActivity extends AppCompatActivity implements LoginViewListener {
     Button btnLogin;
     EditText etUserName;
     EditText etPassword;
     LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginPresenter = new LoginPresenterImpl(this);
        btnLogin = findViewById(R.id.btnLogin);
        etUserName = findViewById(R.id.etUserName);
        etPassword = findViewById(R.id.etPassword);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginPresenter.doLogin(getUsername(), getPassword());
            }
        });
    }

    @Override
    public String getUsername() {
        return etUserName.getText().toString();
    }

    @Override
    public void showUsernameError(int resId) {
        etUserName.setError(getString(resId));
    }

    @Override
    public String getPassword() {
        return etPassword.getText().toString();
    }

    @Override
    public void showPasswordError(int resId) {
        etPassword.setError(getString(resId));

    }

    @Override
    public void startMainActivity() {
        startActivity(new Intent(this, MainActivity.class));
    }

    @Override
    public void showLoginError(int resId) {
        Toast.makeText(this, getString(resId), LENGTH_SHORT).show();
    }

    public int add(int a,int b){
       return  a+b;

    }
}
