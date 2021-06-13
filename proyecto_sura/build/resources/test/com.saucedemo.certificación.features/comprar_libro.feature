#languaje:es
  ##Autor: Jairo Andres Garcia - Jairo_garcia82122@elpoli.edu.co

Feature: Comprar online en la pagina de saucedemo

  Scenario Outline: Compra online
    Given que me encuentro logueado en la pagina de saucedemo
      |user              |      password      |
      | standard_user    | secret_sauce       |
    When procedo a escoger el producto y procedo a realizar la compra
      |nombre              |      apellido      | codigo_postal|
      |       Jairo        |      Garcia        |      57      |
    Then observo el siguiente mensaje <mensaje_esperado>

    Examples:
      |   nombre_producto   |    mensaje_esperado    |
      |Sauce Labs Bike Light|THANK YOU FOR YOUR ORDER|