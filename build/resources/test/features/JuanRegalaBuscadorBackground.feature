Feature: Title of your feature

  Background:
    Given que me encuentro en la pagina de JuanRegala con la url https://juanregala.com.co/

  Scenario: Buscar el producto en el buscador de JuanRegala
    When busco un producto en el buscador
      | nombreProducto                    |
      | Docena de Rosas en Base de Vidrio |
    Then podre ver el producto buscado en la pantalla

  Scenario: Buscar el producto en el buscador de JuanRegala
    When busco un producto en el buscador
      | nombreProducto                    |
      | Caja Sorpresa Dulce               |
    Then podre ver el producto buscado en la pantalla
