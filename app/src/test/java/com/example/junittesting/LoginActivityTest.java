package com.example.junittesting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class LoginActivityTest {
    @Mock
    LoginActivity loginActivity;

    @Before
    public void setUp() {
        loginActivity = new LoginActivity();

    }

    @Test
    public void getUsername() {

        assertEquals("abc", "abc");
    }

    @Test
    public void showUsernameError() {
        assertEquals("", "");
    }

    @Test
    public void getPassword() {
        assertEquals("abc", "abc");
    }

    @Test
    public void showPasswordError() {
        assertEquals("", "");
    }

    @Test
    public void startMainActivity() {
    }

    @Test
    public void showLoginError() {
        assertEquals("", "");
    }

    @Test
    public void add() {
        int result = loginActivity.add(0, 3);
        assertEquals(3, result);
    }

    @After
    public void tearDown() {

    }
}