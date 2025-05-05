Feature: Login na aplicação

  Scenario: Login realizado com sucesso
    Given que o usuário está na página de login
    When ele insere email e senha válidos
    Then ele deve ser redirecionado para a página inicial