package com.saucedemo.certificación.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.saucedemo.certificación.stepdefinition",
        features = "src/test/resources/com.saucedemo.certificación.features/comprar_libro.feature",
        snippets = SnippetType.CAMELCASE
)
public class ComprarArticuloRunner {
}
