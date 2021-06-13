package com.saucedemo.certificación.pageobject;

import org.openqa.selenium.By;

public class MensajePageObject {

    By LblMensajeExitoso= By.xpath("//h2");

    public MensajePageObject() {
    }

    public By getLblMensajeExitoso() {
        return LblMensajeExitoso;
    }

    public void setLblMensajeExitoso(By lblMensajeExitoso) {
        LblMensajeExitoso = lblMensajeExitoso;
    }
}
