Feature: Login in Nova Electronics

  Scenario: Sign In with valid credential
    Given the user goes to login page
    When the user login entering his email and password
    And go to the mi-cuenta page
    Then CERRAR SESIÓN is in the header-top menu
    And the user email appears on the datos-personales page