Feature: Registro de Denúncias

  Scenario: Usuário registra uma denúncia com sucesso
    Given Usuário deseja registrar uma denúncia
    When Usuário envia a descrição e a localização
    Then Sistema retorna sucesso

  Scenario: Usuário tenta registrar uma denúncia sem fornecer descrição
    Given Usuário quer registrar uma denúncia
    When ele envia apenas a localização
    Then o sistema deve retornar um erro

  Scenario: Usuário tenta obter registros com sucesso
    Given que há registros de denúncias no sistema
    When o usuário faz uma requisição para buscar denúncias
    Then o sistema deve retornar uma lista contendo os registros disponíveis