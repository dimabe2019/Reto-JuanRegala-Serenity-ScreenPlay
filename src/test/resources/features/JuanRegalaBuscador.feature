Feature: Title of your feature

  Scenario Outline: <Escenario> <Producto>
    Given que me encuentro en la pagina de JuanRegala con la url <Url>
    When busco el producto <Producto> en el buscador
    Then podre ver el producto <Producto> en pantalla

    Examples:
   | Escenario                                                | Producto                          | Url                         |
    | Buscar el producto en el buscador de JuanRelaga exitoso | Docena de Rosas en Base de Vidrio | https://juanregala.com.co/  |
    | Buscar el producto en el buscador de JuanRelaga exitoso | Caja Sorpresa Dulce               | https://juanregala.com.co/  |
    | Buscar el producto en el buscador de JuanRelaga exitoso | 18 Rosas en Base de Madera        | https://juanregala.com.co/  |
    | Buscar el producto en el buscador de JuanRelaga exitoso | Fiesta de Cerveza                 | https://juanregala.com.co/  |
    | Buscar el producto en el buscador de JuanRelaga exitoso | Balde Cervecero con Mostacho      | https://juanregala.com.co/  |