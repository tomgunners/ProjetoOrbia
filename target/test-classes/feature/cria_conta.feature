Feature: Criar uma Conta

  · Eu como usuário, preciso criar uma conta no site para realizar uma compra

  Scenario: Deve criar uma conta

    Given que estou na tela de pré cadastro
    And insiro um email valido
    When redirecionar para a tela seguinte
    Then preencho as informações pessoais
    And devo ser redirecionado para a tela My Account