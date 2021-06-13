package com.saucedemo.certificación.pageobject;

import org.openqa.selenium.By;

public class IngresarInformacionPageObject {

    By TxtNombre= By.id("first-name");
    By TxtApellido= By.id("last-name");
    By TxtCodePostal= By.id("postal-code");
    By BtnContinuar=By.xpath("//input[@name='continue']");
    By BtnFinish=By.xpath("//button[@name='finish']");


    public IngresarInformacionPageObject() {
    }

    public By getTxtNombre() {
        return TxtNombre;
    }

    public void setTxtNombre(By txtNombre) {
        TxtNombre = txtNombre;
    }

    public By getTxtApellido() {
        return TxtApellido;
    }

    public void setTxtApellido(By txtApellido) {
        TxtApellido = txtApellido;
    }

    public By getTxtCodePostal() {
        return TxtCodePostal;
    }

    public void setTxtCodePostal(By txtCodePostal) {
        TxtCodePostal = txtCodePostal;
    }

    public By getBtnContinuar() {
        return BtnContinuar;
    }

    public void setBtnContinuar(By btnContinuar) {
        BtnContinuar = btnContinuar;
    }

    public By getBtnFinish() {
        return BtnFinish;
    }

    public void setBtnFinish(By btnFinish) {
        BtnFinish = btnFinish;
    }
}
