#enconding: UTF-8
#language: pt
#author: Elton Ferreira

  Funcionalidade: Validar a chamada das requisições das cidades

    @zipCode
    Cenario: Validar a requisição atraves do zipcode
      Dado recuperar as infomações de zipcode "06243" da cidade
      Quando realizar uma requisição GET no serviço pelo ZipCode
      Então valido a cidade de "East Killingly" no retorno do serviço