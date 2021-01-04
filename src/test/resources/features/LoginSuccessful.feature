#enconding: UTF-8
#language: pt
#Author: Elton Ferreira

  Funcionalidade: Validar chamada da requisição do usuario

    @loginSuccessful
    Cenario: Validar login com sucesso
      Dado recuperar informações de um usuario cadastrado
      Quando realizar requisição POST para usuario cadastrado
      Entao validar login com sucesso