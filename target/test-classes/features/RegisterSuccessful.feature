#language: pt
#enconding: UTF-8
#Author: Elton Ferreira

  Funcionalidade: Validar a chamada requisitada pelo usuario

    @registerSuccessful
    Cenario: Validar o registro com sucesso do usuario
      Dado recuperar os parametros de um usuario cadastrado
      Quando realizar a requisição POST no serviço para usuario ja cadastrado
      Entao validar que o usuario esta cadastrado com sucesso