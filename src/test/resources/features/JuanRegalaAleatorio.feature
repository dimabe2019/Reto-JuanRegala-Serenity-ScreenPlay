Feature: Title of your feature

  Scenario Outline: <Escenario>
    Given que me encuentro en la pagina de JuanRegala con la url <Url>
    When busco un producto aleatorio en la pagina
    Then podre ver un producto aleatorio en pantalla

    Examples:
      | Escenario                                          | Url                        |
      | Buscar un producto aleatorio en JuanRegala exitoso | https://juanregala.com.co/ |