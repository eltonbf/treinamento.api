#enconding: UTF-8
#language: pt
#author: Elton Ferreira

  Funcionalidade: Validar chamada da requisição do usuario

    @loginUnsuccessful
    Cenario: Validar o login sem sucesso do usuario
      Dado recuperar informações de um usuario não cadastrado
      Quando realizar a requisição POST no serviço para usuario cadastrado
      Entao validar erro no login