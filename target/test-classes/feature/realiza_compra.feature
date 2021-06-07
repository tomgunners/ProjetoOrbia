Feature: Realiza Compra

  · Eu como usuário logado, desejo realizar uma compra de dois vestidos na loja

  Scenario: Realiza Compra

    Given que estou na tela de login
    And insiro os dados de login corretos
    When navegar para o menu Evening Dresses
    And selecionar o vestido com cores e tamanhos diferentes
    Then vou finalizar o pedido