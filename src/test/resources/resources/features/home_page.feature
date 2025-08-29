Feature: Validação da página inicial do site DEMOQA

  Scenario: Verificar o título da página
    Given que o usuário acessa o site
    Then o título da página deve ser "DEMOQA"