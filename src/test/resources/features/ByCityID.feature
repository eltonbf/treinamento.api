#language: pt
#enconding: UTF-8
#Author: Elton Ferreira

Funcionalidade: Validar a chamada das requisições das cidades

  @getCity
  Cenario: Validar a requisição atraves do ID
    Dado recuperar as informações de ID "3455775" da cidade
    Quando realizar uma requisição GET no serviço pelo ID
    Entao valido a cidade "Osasco" no retorno do serviço