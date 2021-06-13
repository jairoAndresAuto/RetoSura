package com.saucedemo.certificación.steps;

import com.saucedemo.certificación.pageobject.EscogerProductoPageObject;
import com.saucedemo.certificación.pageobject.IngresarInformacionPageObject;
import com.saucedemo.certificación.pageobject.LoginPageObject;
import com.saucedemo.certificación.pageobject.MensajePageObject;
import com.saucedemo.certificación.utils.MetodosGenericos;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComprarArticuloSteps {

    private LoginPageObject login=new LoginPageObject();
    private EscogerProductoPageObject escogerProducto=new EscogerProductoPageObject();
    private IngresarInformacionPageObject ingresarInformacion=new IngresarInformacionPageObject();
    private MensajePageObject mensaje=new MensajePageObject();
    private MetodosGenericos genericos=new MetodosGenericos();
    private WebDriver driver;

    @Step
    public void ingresarAPagina(){
        //wait= new WebDriverWait(login.getDriver(), 30);
        login.getDriver().get("https://www.saucedemo.com/");
        driver=login.getDriver();
    }

    @Step
    public void ingresarLogin(String user,String password){
        genericos.IngresaDato(login.getTxtUsuario(),driver,user);
        genericos.IngresaDato(login.getTxtPassword(),driver,password);
        genericos.clicElemento(login.getTxtLogin(),driver);
    }

    @Step
    public void escogerProducto() {
        genericos.clicElemento(escogerProducto.getBtnAddCart(),driver);
        genericos.clicElemento(escogerProducto.getBtnCarrito(),driver);
        genericos.clicElemento(escogerProducto.getBtnCheckOut(),driver);
    }

    @Step
    public void ingresarInformacion(String nombre,String apellido, String code) {
        genericos.IngresaDato(ingresarInformacion.getTxtNombre(),driver,nombre);
        genericos.IngresaDato(ingresarInformacion.getTxtApellido(),driver,apellido);
        genericos.IngresaDato(ingresarInformacion.getTxtCodePostal(),driver,code);
        genericos.clicElemento(ingresarInformacion.getBtnContinuar(),driver);
        genericos.clicElemento(ingresarInformacion.getBtnFinish(),driver);
    }

    @Step
    public void verificarEtiquetaExito(String mensajeValidar){
        Assert.assertThat(driver.findElement(mensaje.getLblMensajeExitoso()).getText(), Matchers.is(mensajeValidar));
    }
}
