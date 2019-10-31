package com.example.junittesting;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LoginPresenterImplTest extends TestCase {
    @Mock
    private LoginViewListener view;
    @Mock
    private LoginPresenter presenter;
    @Mock
    private LoginService service;

    @Before
    public void setUp() {
        presenter = new LoginPresenterImpl(view);
    }

    @Test
    public void shouldShowErrorMessageWhenUsernameIsEmpty() {
        when(view.getUsername()).thenReturn("");
        presenter.doLogin("", "");
        verify(view).showUsernameError(R.string.username_error);
    }

    @Test
    public void shouldShowErrorMessageWhenPasswordIsEmpty() {
        when(view.getPassword()).thenReturn("");
        presenter.doLogin("aa", "");
        verify(view).showPasswordError(R.string.password_error);
    }
    @Test
    public void shouldStartMainActivityWhenUsernameAndPasswordAreCorrect(){
        presenter.doLogin("Aalishan", "Ansari");
        verify(view).startMainActivity();
    }
}