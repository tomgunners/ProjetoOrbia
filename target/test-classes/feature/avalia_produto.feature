Feature: Avalia Produto

  · Eu como comprador da loja, desejo fazer uma avaliação dos vestidos comprados

  Scenario: Deve Avalia Produto

    Given que insiro os dados de login corretos
    And navego para o menu Evening Dresses
    When selecionar o vestido
    And avaliar o produto
    Then envio a avaliacao