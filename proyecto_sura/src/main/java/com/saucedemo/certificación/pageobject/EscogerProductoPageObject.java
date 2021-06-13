package com.saucedemo.certificación.pageobject;

import org.openqa.selenium.By;

public class EscogerProductoPageObject {

    public EscogerProductoPageObject() {
    }

    /*(//button[contains(.,'Add to cart')])[parametro] parametro=posicion de la prenda*/
    By BtnAddCart=By.xpath("(//button[contains(.,'Add to cart')])[3]");
    By BtnCarrito=By.id("shopping_cart_container");
    By BtnCheckOut=By.xpath("//button[contains(.,'Checkout')]");

    public By getBtnAddCart() {
        return BtnAddCart;
    }

    public void setBtnAddCart(By btnAddCart) {
        BtnAddCart = btnAddCart;
    }

    public By getBtnCarrito() {
        return BtnCarrito;
    }

    public void setBtnCarrito(By btnCarrito) {
        BtnCarrito = btnCarrito;
    }

    public By getBtnCheckOut() {
        return BtnCheckOut;
    }

    public void setBtnCheckOut(By btnCheckOut) {
        BtnCheckOut = btnCheckOut;
    }
}
