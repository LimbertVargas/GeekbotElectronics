Feature: User Information
  Scenario: Add the born date in user information page
    Given the user goes to login page
    And the user goes to mi-cuenta page
    When the user goes to datos-personales page
    And the user adds a born date and the password
    Then and alert Informacion actualizada correctamente is displayed
    And the born date appears on information page