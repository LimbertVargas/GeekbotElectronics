Feature: Login in Nova Electronics
  Scenario: Sign In with valid credential
    Given the user goes to the login page
    When the user login entering his email and password
    And return to the login page
    Then INFORMACIÓN tittle is shown
    And CERRAR SESIÓN is in the header-top menu
    And the user email appears on the datos-personales page