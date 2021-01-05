#enconding: UTF-8
#language: pt
#author: Elton Ferreira

  Funcionalidade: Validar a chamada das requisições das cidades

    @coordinates
    Cenario: Validar a requisição atraves das coodenadas
      Dado recuperar as informações de lat "-23.53" lon "-46.79"
      Quando realizar uma requisição GET no serviço pelas coordenadas
      Entao valido a cidade "Osasco" no retorno do serviço