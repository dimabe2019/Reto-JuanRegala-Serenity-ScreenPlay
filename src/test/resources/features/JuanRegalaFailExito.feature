Feature: Title of your feature

  Background:
    Given que me encuentro en la pagina de JuanRegala con la url https://juanregala.com.co/


  Scenario: busca el producto exitoso en el buscador de JuanRegala
    When digita el producto en el buscador
      | nombreProducto                    |
      | Docena de Rosas en Base de Vidrio |
    Then puede observar un producto en la busqueda


  Scenario: busca el producto fallido en el buscador de JuanRegala
    When ingresa el producto fallido en el buscador
      | nombreProducto                    |
      | Carro Bmw                         |
    Then podre ver un producto en la busqueda
