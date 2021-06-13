package com.saucedemo.certificación.pageobject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPageObject extends PageObject {

    By TxtUsuario=By.id("user-name");
    By TxtPassword=By.id("password");
    By TxtLogin=By.id("login-button");

    public LoginPageObject() {
    }

    public By getTxtUsuario() {
        return TxtUsuario;
    }

    public void setTxtUsuario(By txtUsuario) {
        TxtUsuario = txtUsuario;
    }

    public By getTxtPassword() {
        return TxtPassword;
    }

    public void setTxtPassword(By txtPassword) {
        TxtPassword = txtPassword;
    }

    public By getTxtLogin() {
        return TxtLogin;
    }

    public void setTxtLogin(By txtLogin) {
        TxtLogin = txtLogin;
    }
}
