#enconding: UTF-8
#language: pt
#author: Elton Ferreira

  Funcionalidade: Validar Chamada da requisição do usuario

    @registerUnsuccessful
    Cenario: Validar o registro sem sucesso do usuario
      Dado recuperar as informações de um usuario cadastrado
      Quando realizar a requisição POST no serviço para usuario cadastrado
      Entao validar erro no login