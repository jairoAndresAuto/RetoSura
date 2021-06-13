package com.saucedemo.certificación.stepdefinition;

import com.saucedemo.certificación.steps.ComprarArticuloSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;
import java.util.Map;

public class ComprarArticulo {

    @Steps
    private ComprarArticuloSteps comprarArticulo;

    @Given("^que me encuentro logueado en la pagina de saucedemo$")
    public void queMeEncuentroLogueadoEnLaPaginaDeSaucedemo(List<Map<String,String>> credenciales) {
        comprarArticulo.ingresarAPagina();
        comprarArticulo.ingresarLogin(credenciales.get(0).get("user"),credenciales.get(0).get("password"));
    }

    @When("^procedo a escoger el producto y procedo a realizar la compra$")
    public void procedoAEscogerElProductoYProcedoARealizarLaCompra(List<Map<String,String>> datosPersonales) {
        comprarArticulo.escogerProducto();
        comprarArticulo.ingresarInformacion(datosPersonales.get(0).get("nombre"),
                datosPersonales.get(0).get("apellido"),datosPersonales.get(0).get("codigo_postal"));
    }

    @Then("^observo el siguiente mensaje (.*)$")
    public void observoElSiguienteMensajeTHANKYOUFORYOURORDER(String mensajeExito) {
        comprarArticulo.verificarEtiquetaExito(mensajeExito);
    }

}
